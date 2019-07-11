package ru.ignios.calc.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ignios.calc.utilities.AnnuityCalculator;

@RestController
public class CalculationController {

    @GetMapping(value = "/calc", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<?> calculateAnnuityPayment(
            @RequestParam
                    Integer creditSummary,

            @RequestParam
                    Double interestRate,

            @RequestParam
                    Integer creditTerm
    ) {
        return
        ResponseEntity.ok()
                .body(AnnuityCalculator.calcMonthlyPayment(creditSummary, interestRate, creditTerm ));

    }
}
