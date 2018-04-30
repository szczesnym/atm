package com.kodilla.atm;

import org.junit.Test;
import org.junit.Assert;

public class AtmImplTestSuite {
    @Test
    public void testCashOutNoCash() {
        //Given

        //When
        AtmImpl sutAtm = new AtmImpl(100);
        //Then
        Assert.assertFalse(sutAtm.cashOut(500));
    }

    @Test
    public void testCashWithCash() {
        //Given
        AtmImpl sutAtm = new AtmImpl(10);
        //When
        sutAtm.cashIn(40);
        //Then
        Assert.assertTrue(sutAtm.cashOut(50));
    }
}
