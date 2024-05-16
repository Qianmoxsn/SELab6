public class PasswordValidator {

    public String validate(String password) {
        // Check length
        if (password.length() < 5 || password.length() > 9) {
            return "Invalid";
        }

        // Check character composition
        if (!password.matches("[a-zA-Z0-9]+")) {
            return "Invalid";
        }

        // Check presence of at least one letter and one digit
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!hasLetter || !hasDigit) {
            return "Invalid";
        }

        // If all conditions are met, password is valid
        return "Valid";
    }
}
