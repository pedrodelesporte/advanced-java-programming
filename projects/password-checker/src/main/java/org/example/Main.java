package org.example;


import org.example.core.PasswordChecker;
import org.example.core.PasswordResults;
import org.example.rules.*;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Password Checker.
 */
public class Main {


    /**
     * Command Line Password Checker.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        PasswordChecker checker = getPasswordChecker();


        introduction();
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        while (! password.equals("q")) {
            PasswordResults results = checker.validate(password);
            outputResults(results);
            System.out.print("\nEnter password to check, q to quit:  ");
            password = scanner.next();
        }
    }


    /**
     * Output Password Results.
     * @param results password results.
     */
    private static void outputResults(PasswordResults results) {
        ArrayList<String> rulesPassed = results.getRulesPassed();
        ArrayList<String> rulesFailed = results.getRulesFailed();
        System.out.println();
        for (String ruleDescription: rulesPassed) {
            System.out.println("✅ " + ruleDescription);
        }
        for (String ruleDescription: rulesFailed) {
            System.out.println("⛔ " + ruleDescription);
        }
    }


    /**
     * Output Command Line Introduction.
     */
    private static void introduction() {
        System.out.println("Password Checker v 1.0");
        System.out.println("-------------------------");
        System.out.print("Enter password to check, q to quit:  ");
    }


    /**
     * Initialize the Password Checker.
     * @return Password Checker.
     */
    private static PasswordChecker getPasswordChecker() {
        ArrayList<PasswordRule> ruleList = new ArrayList<>();
        ruleList.add(new MinimumLength(5));
        ruleList.add(new ContainsLowerCase());
        ruleList.add(new ContainsUpperCase());
        ruleList.add(new ContainsNumber());
        ruleList.add(new ContainsSpecialChar("#$%"));
        return new PasswordChecker(ruleList);
    }
}
