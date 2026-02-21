package org.example.rules;

import org.example.PasswordRule;

/**
 * A rule that checks if a password has at least one upper case letter.
 */
public class ContainsUpperCase implements PasswordRule {
    private final String ruleDescription;

    /**
     * Creates the rule and sets the description for upper case checking.
     */
    public ContainsUpperCase() {
        this.ruleDescription = "Password contains one upper case character";
    }

    /**
     * Gets the text that explains this rule.
     *
     * @return the rule description
     */
    @Override
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Checks if the password has any capital letters.
     *
     * @param password the password to check
     * @return true if an upper case letter is found, false if not
     */
    @Override
    public boolean isValid(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}