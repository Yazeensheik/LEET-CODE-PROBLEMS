// User-defined exception class
class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }

    public InvalidCountryException() {
        super("Invalid country");
    }
}

// Main class with user registration method
public class UserRegistration {

    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();

        // Example 1: Input data - Mickey, US
        try {
            userReg.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        // Example 2: Input data - Mini, India
        try {
            userReg.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
