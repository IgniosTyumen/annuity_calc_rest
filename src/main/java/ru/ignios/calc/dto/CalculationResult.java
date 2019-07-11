package ru.ignios.calc.dto;

import lombok.Data;

@Data
public class CalculationResult {

    private String monthlyPayment;

    private String message="Ежемесячная плата составит ";

    private Boolean ifSuccessfully=true;

    public CalculationResult(Double monthlyPayment){
       this.monthlyPayment = String.format("%.2f",monthlyPayment.floatValue());
    }
}
