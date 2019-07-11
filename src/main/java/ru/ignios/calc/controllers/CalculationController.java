package ru.ignios.calc.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ignios.calc.dto.CalculationResult;
import ru.ignios.calc.dto.InputDTO;
import ru.ignios.calc.utilities.AnnuityCalculator;

import javax.validation.Valid;


@RestController
@Validated
public class CalculationController {

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    @PostMapping(value = "/calc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> calculateAnnuityPayment(
            @RequestBody
                    @Valid
                    InputDTO input

    ) {
        System.out.println(input);
       Double resultOfCalculation = AnnuityCalculator.calcMonthlyPayment(input.getCreditSummary(), input.getInterestRate(), input.getCreditTerm())
                .orElseThrow(() -> new RuntimeException());

        return ResponseEntity.ok()
                .body(
                        new CalculationResult(resultOfCalculation)
                );

    }
}
