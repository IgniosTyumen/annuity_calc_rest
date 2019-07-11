package ru.ignios.calc.utilities;



import java.util.Optional;

public class AnnuityCalculator {

    public static Optional<Double> calcMonthlyPayment(Integer creditSummary, Double interestRate, Integer creditTerm){

        Integer monthToPay = creditTerm*12;
        Double monthlyInterestRate = interestRate/12/100;
        double delimer = (Math.pow((1+monthlyInterestRate),monthToPay)-1);
        if (delimer!=0) {
            Double coefficient = (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), monthToPay))/delimer;
            Double result =coefficient*creditSummary;
            return Optional.of(result);
        } else throw new RuntimeException("деление на 0");
    }
}
