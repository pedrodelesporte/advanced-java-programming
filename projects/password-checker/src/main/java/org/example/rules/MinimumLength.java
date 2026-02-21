package org.example.rules;

import org.example.PasswordRule;

/**
 * A rule that checks if a password is long enough.
 * It compares the password length to a minimum number you set.
 */
public class MinimumLength implements PasswordRule {
    protected int minimumLength;
    private final String ruleDescription;

    /**
     * Creates the rule with a specific length requirement.
     *
     * @param i the smallest number of characters the password can have
     */
    public MinimumLength(int i) {
        this.minimumLength = i;
        this.ruleDescription = "Minimum Length of the password is >=" + i;
    }

    /**
     * Gets the text that explains the length requirement.
     *
     * @return the rule description with the minimum number
     */
    @Override
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Checks if the password has enough characters.
     * It also checks to make sure the password is not null.
     *
     * @param password the password to check
     * @return true if the length is okay, false if it is too short or null
     */
    @Override
    public boolean isValid(String password) {
        return password != null && password.length() >= minimumLength;
    }
}