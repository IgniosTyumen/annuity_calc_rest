package ru.ignios.calc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Validated
@Data
@AllArgsConstructor
public class InputDTO {

    @Min(value = 500_000, message = "Сумма кредита должна быть больше 500 000 рублей")
    @Max(value = 1_000_000, message = "Сумма кредита должна быть меньше 1 000 000 рублей")
    Integer creditSummary;

    @Min(value = 1, message = "Процентная ставка не может быть меньше 1%")
    @Max(value = 100, message = "Процентная ставка не может быть выше 100%")
    Double interestRate;

    @Min(value = 10, message = "Срок кредита не менее 10 лет")
    @Max(value = 50, message = "Срок кредита не более 50 лет")
    Integer creditTerm;
}
