package org.example;

/**
 * Password Rule Interface.
 */
public interface PasswordRule {


    /**
     * Return the Rule Description.
     * @return rule description.
     */
    String getRuleDescription();


    /**
     * Determines if the specified password is valid.
     * @return true or false.
     */
    boolean isValid(String password);
}
