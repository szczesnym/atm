package com.kodilla.atm;

import org.junit.Test;
import org.junit.Assert;

public class AtmImplTestSuite {
    @Test
    public void testCashOutNoCash() {
        //Given
        AtmImpl sutAtm = new AtmImpl(100);
        //When
        boolean sutAtmResult = sutAtm.cashOut(500);
        //Then
        Assert.assertFalse(sutAtmResult);
    }

    @Test
    public void testCashWithCash() {
        //Given
        AtmImpl sutAtm = new AtmImpl(10);
        //When
        sutAtm.cashIn(40);
        boolean sutAtmResult = sutAtm.cashOut(50);
        //Then
        Assert.assertTrue(sutAtmResult);
    }
}
