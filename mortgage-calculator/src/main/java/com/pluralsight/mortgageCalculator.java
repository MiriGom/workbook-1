package com.pluralsight;

import java.util.Scanner;

public class mortgageCalculator {

        public static void main(String[] args){
            double principle;
            double interestRate;
            int termOfLoanInYears;
            int twelveMonths = 12;

            Scanner calculatorScanner = new Scanner(System.in);

            System.out.println("Please enter the principle here: ");
            principle = calculatorScanner.nextDouble();
            calculatorScanner.nextLine();

            System.out.println("Please enter the interest rate here: ");
            interestRate = calculatorScanner.nextDouble();
            calculatorScanner.nextLine();

            interestRate = interestRate / 100;

            System.out.println("Please enter the length of the loan in years here : ");
            termOfLoanInYears = calculatorScanner.nextInt();
            calculatorScanner.nextLine();

            double numerator = principle * interestRate / twelveMonths;

            double a = 1 + interestRate / twelveMonths;
            double b = - termOfLoanInYears * twelveMonths;

            double p = Math.pow(a, b);
            double denominator = 1 - p;
            double payment = numerator / denominator;
            double monthlyPayment = Math.round(payment * 100.0) / 100.0;

            System.out.println("Your payment is: " + monthlyPayment);

            int totalNumberOfPayments = termOfLoanInYears * twelveMonths;
            double totalAmountPaid = monthlyPayment * totalNumberOfPayments;
            double totalInterest = totalAmountPaid - principle;

            System.out.println("Interest paid : " + totalInterest);
        }
    

}
