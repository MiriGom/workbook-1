package com.pluralsight;

import java.util.Scanner;

public class CDCalculator {
    public static void main(String[] args){
        double deposit;
        double interestRate;
        int numberOfYears;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Please enter your deposit here: ");
        deposit = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Please enter your interest rate here: ");
        interestRate = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        interestRate = interestRate / 100;

        System.out.println("Please enter the number of years you plan to pay: ");
        numberOfYears = calculatorScanner.nextInt();
        calculatorScanner.nextLine();

        int twelveMonths = 12;
        double a = 1 + interestRate / twelveMonths;
        double b = twelveMonths * numberOfYears;
        double p = Math.pow(a, b);

        double endingBalance = p * deposit;
        double interestEarned = endingBalance - deposit;

        System.out.println("Your payment is: " + endingBalance);
        System.out.println("Your earned interest: " + interestEarned);
    }
}

