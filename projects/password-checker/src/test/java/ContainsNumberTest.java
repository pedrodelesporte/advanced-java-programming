import org.example.rules.ContainsNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsNumberTest {

    @Test
    void testIsValid_WithNumbers() {
        ContainsNumber rule = new ContainsNumber();

        // Tests that should pass (return true)
        assertTrue(rule.isValid("pedro123"));
        assertTrue(rule.isValid("1")); // only a number
        assertTrue(rule.isValid("abc4def")); // number in the middle
        assertTrue(rule.isValid("!@#5%^&")); // number mixed with special characters
    }

    @Test
    void testIsValid_WithoutNumbers() {
        ContainsNumber rule = new ContainsNumber();

        // Tests that should fail (return false)
        assertFalse(rule.isValid("pedro")); // only letters
        assertFalse(rule.isValid("PEDRO")); // only uppercase letters
        assertFalse(rule.isValid("!@#$%^&*")); // only special characters
        assertFalse(rule.isValid("")); // empty string
    }

}