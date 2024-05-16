import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testLengthPartition() {
        PasswordValidator validator = new PasswordValidator();

        // Test Case 1
        assertEquals("Invalid", validator.validate("abc"));

        // Test Case 2
        assertEquals("Valid", validator.validate("abcd1"));

        // Test Case 3
        assertEquals("Invalid", validator.validate("abcdefghi"));
    }

    @Test
    public void testCharacterCompositionPartition() {
        PasswordValidator validator = new PasswordValidator();

        // Test Case 4
        assertEquals("Valid", validator.validate("abc123"));

        // Test Case 5
        assertEquals("Invalid", validator.validate("123456"));

        // Test Case 6
        assertEquals("Invalid", validator.validate("abc@123"));
    }

    @Test
    public void testPresenceOfLetterAndDigitPartition() {
        PasswordValidator validator = new PasswordValidator();

        // Test Case 7
        assertEquals("Invalid", validator.validate("abcdef"));

        // Test Case 8
        assertEquals("Invalid", validator.validate("123456"));

        // Test Case 9
        assertEquals("Valid", validator.validate("abc123"));
    }
}

