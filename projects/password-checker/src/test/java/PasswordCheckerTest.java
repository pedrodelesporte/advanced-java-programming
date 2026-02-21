import org.example.core.PasswordChecker;
import org.example.core.PasswordResults;
import org.example.PasswordRule;
import org.example.rules.ContainsLowerCase;
import org.example.rules.ContainsNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void testAllRulesPass() {
        // Set up the same real rules
        ArrayList<PasswordRule> rules = new ArrayList<>();
        rules.add(new ContainsLowerCase());
        rules.add(new ContainsNumber());

        PasswordChecker checker = new PasswordChecker(rules);

        // pedro123 contains both a lowercase letter and a number
        PasswordResults results = checker.validate("pedro123");

        // Assuming PasswordResults uses lists to store the descriptions
        // Adjust these assertions if your methods are named differently
        assertEquals(2, results.getRulesPassed().size());
        assertEquals(0, results.getRulesFailed().size());
        assertTrue(results.getRulesPassed().contains("Password contains one lower case character"));
        assertTrue(results.getRulesPassed().contains("Password contains one number"));
    }

    @Test
    void testAllRulesFail() {
        ArrayList<PasswordRule> rules = new ArrayList<>();
        rules.add(new ContainsLowerCase());
        rules.add(new ContainsNumber());

        PasswordChecker checker = new PasswordChecker(rules);

        // "PEDRO!" has NO lowercase letters and NO numbers
        PasswordResults results = checker.validate("PEDRO!");

        assertEquals(0, results.getRulesPassed().size());
        assertEquals(2, results.getRulesFailed().size());
        assertTrue(results.getRulesFailed().contains("Password contains one lower case character"));
        assertTrue(results.getRulesFailed().contains("Password contains one number"));
    }

    @Test
    void testMixedRules() {
        ArrayList<PasswordRule> rules = new ArrayList<>();
        rules.add(new ContainsLowerCase());
        rules.add(new ContainsNumber());

        PasswordChecker checker = new PasswordChecker(rules);

        // "pedro123!" has lowercase letters, but NO numbers
        PasswordResults results = checker.validate("pedro123!");

        assertEquals(1, results.getRulesPassed().size());
        assertEquals(1, results.getRulesFailed().size());
        assertTrue(results.getRulesPassed().contains("Password contains one lower case character"));
        assertTrue(results.getRulesFailed().contains("Password contains one number"));
    }

    @Test
    void testEmptyRulesList() {
        // Test what happens if we pass an empty list of rules
        ArrayList<PasswordRule> emptyRules = new ArrayList<>();
        PasswordChecker checker = new PasswordChecker(emptyRules);

        PasswordResults results = checker.validate("any_password");

        // It should just return empty results without crashing
        assertTrue(results.getRulesPassed().isEmpty());
        assertTrue(results.getRulesFailed().isEmpty());
    }
}