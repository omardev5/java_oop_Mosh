package com.codewithmosh;

import java.text.NumberFormat;
public class Mortgagereport {
    private final NumberFormat currency;
    private  MortgagCalculator calculator;

    public Mortgagereport(MortgagCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public  void printPaymentSchedule() {
        System.out.println();
        System.out.println("payment schedule".toUpperCase());
        System.out.println("----------------");
        for(double balance : calculator.getReminingBalances())
            System.out.println(currency.format(balance));

    }

    public void printMortgage() {

        double mortgage = calculator.calculateMortgage();


        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("Mortgage".toUpperCase());
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
