package com.pluralsight;

import java.util.Scanner;
import java.util.Arrays;

public class whichCalculator {
    public static void main(String[] args) {

        boolean hasEnteredCorrectValue = false;
        String calculatorType = null;
        String userInput;

        Scanner scanner = new Scanner(System.in);
        String[] availableOptions = {"ms", "cdc", "ac"};
        System.out.println("Please choose a calculator \n enter \"ms\" for Mortgage Calculator \n enter \"cdc\" for CD Calculator \n enter \"ac\" for Annuity Calculator");

        while (!hasEnteredCorrectValue) {
            userInput = scanner.nextLine();

            if (Arrays.asList(availableOptions).contains(userInput)) {
                hasEnteredCorrectValue = true;
                calculatorType = userInput;
            } else {
                System.out.println(userInput + " is incorrect.");
                System.out.println("The available options are \"ms\", \"cdc\", \"ac\".");
            }
        }
        System.out.println("You chose calculator " + calculatorType);
    }
}
