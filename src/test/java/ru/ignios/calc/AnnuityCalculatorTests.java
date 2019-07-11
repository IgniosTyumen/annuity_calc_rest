package ru.ignios.calc;

import org.junit.Assert;
import org.junit.Test;
import ru.ignios.calc.utilities.AnnuityCalculator;


public class AnnuityCalculatorTests {

    @Test
    public void testCalc(){
        Double result = AnnuityCalculator.calcMonthlyPayment(30000,18.0,3).get();
        Double expected = 1084.5718660775105;
        Assert.assertEquals(expected,result);
    }

    @Test(expected = RuntimeException.class)
    public void testWrongAnswerCalc(){
        Double result = AnnuityCalculator.calcMonthlyPayment(30000,18.0,0).get();
}



}
