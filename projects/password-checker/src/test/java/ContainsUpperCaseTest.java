import org.example.rules.ContainsUpperCase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContainsUpperCaseTest {

    @Test
    void testContainsUpperCase() {
        ContainsUpperCase rule = new ContainsUpperCase();

        assertTrue(rule.isValid("Pedro"));
        assertTrue(rule.isValid("bHCC"));
        assertTrue(rule.isValid("pedrO"));
    }
    @Test
    void testDontContainsUpperCase() {
        ContainsUpperCase rule = new ContainsUpperCase();

        assertFalse(rule.isValid("pedro"));
        assertFalse(rule.isValid("bhcc"));
        assertFalse(rule.isValid("kendricklamar"));
        assertFalse(rule.isValid("")); // empty string

    }
}
