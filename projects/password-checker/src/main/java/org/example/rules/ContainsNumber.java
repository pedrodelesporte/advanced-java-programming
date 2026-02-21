package org.example.rules;

import org.example.PasswordRule;

/**
 * A rule that checks if a password has at least one number in it.
 */
public class ContainsNumber implements PasswordRule {
    private final String ruleDescription;

    /**
     * Creates the rule and sets its description.
     */
    public ContainsNumber() {
        this.ruleDescription = "Password contains one number";
    }

    /**
     * Gets the text that describes what this rule does.
     *
     * @return the description of the rule
     */
    @Override
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Checks if the given password has at least one number.
     *
     * @param password the password to check
     * @return true if there is a number, false if there is no number
     */
    @Override
    public boolean isValid(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}