package org.example.rules;

import org.example.PasswordRule;

/**
 * A rule that checks if a password has at least one special character.
 * It uses a list of characters that you provide.
 */
public class ContainsSpecialChar implements PasswordRule {
    private final String ruleDescription;
    private String SpecialChars;

    /**
     * Creates the rule with a list of special characters.
     *
     * @param s a string containing all the special characters allowed
     */
    public ContainsSpecialChar(String s) {
        this.SpecialChars = s;
        this.ruleDescription = "Password contains one special character";
    }

    /**
     * Gets the text that describes this rule.
     *
     * @return the rule description
     */
    @Override
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Checks if the password has any character from the special character list.
     *
     * @param password the password to check
     * @return true if a special character is found, false if not
     */
    @Override
    public boolean isValid(String password) {
        for (char c : password.toCharArray()) {
            if (SpecialChars.contains(String.valueOf(c))) {
                return true;
            }

        }
        return false;
    }
}