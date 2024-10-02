package com.pluralsight;

import java.util.Scanner;

public class annuityCalculator {
    public static void main(String[] args){
        double monthlyPayment;
        double interestRate = 0;
        int yearsToPay = 0;
        int twelveMonths = 12;
        double annualInterestRate;

        Scanner calculatorScanner = new Scanner(System.in);
        System.out.println("Please enter your monthly payment here:");
        monthlyPayment = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Please enter your annual interest rate here:");
        annualInterestRate = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        annualInterestRate = annualInterestRate / 100;

        System.out.println("Please enter the number of years to pay here:");
        yearsToPay = calculatorScanner.nextInt();
        calculatorScanner.nextLine();

        double monthlyRate = annualInterestRate / twelveMonths;
        int totalPayments = yearsToPay * twelveMonths;
        double a = 1 + monthlyRate;
        double b = -totalPayments;
        double p = Math.pow(a, b);
        double numerator = 1 - p;
        double answer = monthlyPayment * numerator / monthlyRate;


        System.out.println("You would need to invest today: " + answer );


    }
}


