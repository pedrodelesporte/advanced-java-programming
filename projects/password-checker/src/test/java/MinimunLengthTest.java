
import org.example.rules.MinimumLength;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for the MinimumLength password rule.
 * Tests for valid, invalid, and edge cases.
 */
public class MinimunLengthTest {

    // Test case 1: Password is exactly the minimum length (Edge Case)
    @Test
    void testExactMinimumLength() {

        int minLength = 8;
        MinimumLength rule = new MinimumLength(minLength);
        String password = "12345678";


        assertTrue(rule.isValid("Password of exact minimum length.."));
    }

    // Test case 2: Password is longer than the minimum length (Valid)
    @Test
    void testGreaterThanMinimumLength() {
        // Arrange
        int minLength = 5;
        MinimumLength rule = new MinimumLength(minLength);
        String password = "pedrodelesporte";

        // Act
        assertTrue(rule.isValid("Password of greater than minimum length.."));

    }

    // Test case 3: Password is shorter than the minimum length (Invalid)
    @Test
    void testIsValid_lessThanMinimumLength() {

        int minLength = 10;
        MinimumLength rule = new MinimumLength(minLength);
        String password = "short";

        assertFalse(rule.isValid("Password of shorter than minimum length.."));

    }

    // Test case 4: Testing a null password string (Edge Case)
    @Test
    void testIsValid_nullPassword() {

        int minLength = 5;
        MinimumLength rule = new MinimumLength(minLength);
        String password = null;

        assertFalse(rule.isValid("Null password"));

    }

}