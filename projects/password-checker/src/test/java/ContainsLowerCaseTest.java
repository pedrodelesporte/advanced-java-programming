import org.example.rules.ContainsLowerCase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsLowerCaseTest {

    @Test
    void testContainsLowerCase() {
        ContainsLowerCase rule = new ContainsLowerCase();

        // Tests that should pass (return true)
        assertTrue(rule.isValid("password"));
        assertTrue(rule.isValid("PASSWORd")); // only one lowercase
        assertTrue(rule.isValid("1234a!@#")); // mixed with numbers and symbols
    }

    @Test
    void testDontContainsLowerCase() {
        ContainsLowerCase rule = new ContainsLowerCase();

        // Tests that should fail (return false)
        assertFalse(rule.isValid("PASSWORD"));
        assertFalse(rule.isValid("12345678"));
        assertFalse(rule.isValid("!@#$%^&*"));
        assertFalse(rule.isValid("")); // empty string
    }


}