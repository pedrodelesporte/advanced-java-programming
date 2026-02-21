import org.example.rules.ContainsSpecialChar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsSpecialCharTest {

    @Test
    void testWithSpecialCharacters() {
        // Defining the specific special characters allowed for this rule
        ContainsSpecialChar rule = new ContainsSpecialChar("!@#$%");

        assertTrue(rule.isValid("pe!dro"));
        assertTrue(rule.isValid("12345@"));
        assertTrue(rule.isValid("#")); // only a special character
    }

    @Test
    void testWithoutSpecialCharacters() {
        ContainsSpecialChar rule = new ContainsSpecialChar("!@#$%");

        assertFalse(rule.isValid("pedro"));
        assertFalse(rule.isValid("12345678"));
        assertFalse(rule.isValid("ped^ro")); // '^' is a special char, but not in our defined list
        assertFalse(rule.isValid("")); // empty password
    }

}