package org.example.core;

import org.example.PasswordRule;

import java.util.ArrayList;

/**
 * This class keeps track of which password rules passed and which ones failed.
 * It stores the results in two separate lists.
 */
public class PasswordResults {
    private ArrayList<String> rulesFailed;
    private ArrayList<String> rulesPassed;

    /**
     * Creates a new result object.
     * It sets up empty lists for the passed and failed rules.
     */
    public PasswordResults() {
        this.rulesFailed = new ArrayList<>();
        this.rulesPassed = new ArrayList<>();
    }

    /**
     * Gets the list of rules that the password followed correctly.
     *
     * @return a list of descriptions for rules that passed
     */
    public ArrayList<String> getRulesPassed() {
        return rulesPassed;
    }

    /**
     * Gets the list of rules that the password did not follow.
     *
     * @return a list of descriptions for rules that failed
     */
    public ArrayList<String> getRulesFailed() {
        return rulesFailed;
    }

    /**
     * Adds a rule description to the list of failed rules.
     *
     * @param ruleDescription the text explaining the rule that failed
     */
    public void setRulesFailed(String ruleDescription){
        this.rulesFailed.add(ruleDescription);
    }

    /**
     * Adds a rule description to the list of passed rules.
     *
     * @param ruleDescription the text explaining the rule that passed
     */
    public void setRulesPassed(String ruleDescription){
        this.rulesPassed.add(ruleDescription);
    }
}