package com.codewithmosh;

public class MortgagCalculator {
    public int principal;
    public float annualInterest;
    private byte years;

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    public  byte MONTHS = 1;


    public MortgagCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }


    public double calculateBalance(short numberOFPaymentsMade) {


        float monthlyInterest = getMonthlyInterest();
        float numberOFPayments = getNumberOFPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOFPayments) - Math.pow(1 + monthlyInterest, numberOFPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOFPayments) - 1);

        return balance;


    }

    public double[] getReminingBalances(){
        var  balances = new double[getNumberOFPayments()];
        for (short month = 1; month <= balances.length; month++)

          balances[month - 1] = calculateBalance(month);

        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOFPayments() {
        return years * MONTHS_IN_YEAR;
    }



    public double calculateMortgage(

    ) {
        float monthlyInterest = getMonthlyInterest();
        float numberOFPayments = getNumberOFPayments();

        double mortgage = principal
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOFPayments))
                / (Math.pow(1 + monthlyInterest, numberOFPayments) - 1));

        return mortgage;

    }
}


