package com.kodilla.atm;

public class AtmImpl implements AtmInterface{
    private double cashInAtm;

    public boolean cashOut(double amount) {
        if(amount <= this.cashInAtm) {
            System.out.format("Cased out of %f successful\n", amount);
            return true;
        } else {
            System.out.println("Not enough cash");
            return false;
        }
    }

    public boolean cashIn(double amount) {
        this.cashInAtm += amount;
        return true;
    }

    public AtmImpl(double cashInAtm) {
        this.cashInAtm = cashInAtm;
    }
}
