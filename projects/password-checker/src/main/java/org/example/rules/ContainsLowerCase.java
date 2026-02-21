package org.example.rules;

import org.example.PasswordRule;

/**
 * A rule that checks if a password has at least one small (lower case) letter.
 */
public class ContainsLowerCase implements PasswordRule {
    private final String ruleDescription;

    /**
     * Creates the rule and sets the message for lower case checking.
     */
    public ContainsLowerCase() {
        this.ruleDescription = "Password contains one lower case character";

    }

    /**
     * Gets the text that explains what this rule is looking for.
     *
     * @return the rule description
     */
    @Override
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Checks if the password has any small letters.
     *
     * @param password the password to check
     * @return true if a small letter is found, false if not
     */
    @Override
    public boolean isValid(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}