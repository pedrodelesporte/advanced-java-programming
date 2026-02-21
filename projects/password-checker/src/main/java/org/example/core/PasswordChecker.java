package org.example.core;

import org.example.PasswordRule;

import java.util.ArrayList;

/**
 * This class checks passwords using a list of rules.
 * It goes through each rule and keeps track of which ones the password follows.
 */
public class PasswordChecker {

    private ArrayList<PasswordRule> rulesList;

    /**
     * Creates a new checker with a list of password rules.
     *
     * @param ruleList a list of rules to use for checking the password
     */
    public PasswordChecker(ArrayList<PasswordRule> ruleList) {
        this.rulesList = new ArrayList<>(ruleList);
    }

    /**
     * Tests a password against all the rules in the list.
     * It records if the password passed or failed each rule.
     *
     * @param password the password text to be checked
     * @return a PasswordResults object that shows which rules passed and failed
     */
    public PasswordResults validate(String password) {
        PasswordResults results = new PasswordResults();

        for (PasswordRule rule : rulesList) {
            if (rule.isValid(password)) {
                results.setRulesPassed(rule.getRuleDescription());
            } else  {
                results.setRulesFailed(rule.getRuleDescription());
            }
        }
        return results;
    }
}