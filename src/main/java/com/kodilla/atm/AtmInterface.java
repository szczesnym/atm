package com.kodilla.atm;

public interface AtmInterface {
    boolean cashOut(double amount);
    boolean cashIn(double amount);
    default boolean getConnectionInfo() {
        return true;
    }
    static void closeConnetion() {
        System.out.println("Connection has been closed");
    }
}
