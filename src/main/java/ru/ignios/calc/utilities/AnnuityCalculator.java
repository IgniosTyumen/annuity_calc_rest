package ru.ignios.calc.utilities;


public class AnnuityCalculator {

    public static Double calcMonthlyPayment(Integer creditSummary, Double interestRate,Integer creditTerm){

        Integer monthToPay = creditTerm*12;
        Double monthlyInterestRate = interestRate/12;
        Double coefficient = Math.pow((monthlyInterestRate*(1+monthlyInterestRate)),monthToPay)
                                        /
                (Math.pow((1+monthlyInterestRate),monthToPay)-1);
        return coefficient*creditSummary;
    }
}
