package com.codewithmosh;

public class Main {



    public static void main(String[] args) {

        int principal=(int) Console.readNumber("principal: ",1000,1_000_000);
        float annualInterest = (float) Console.readNumber("Anuual Interest Rate: ",1,30);
        byte years =(byte) Console.readNumber("Period (years): ", 1,30);

        var calculator = new MortgagCalculator(principal, annualInterest,years);

        var report = new  Mortgagereport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();


    }



}
