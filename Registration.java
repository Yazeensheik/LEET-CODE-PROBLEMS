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
public class Registration {
    
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Registration userReg = new Registration();
        
        // Test cases
        try {
            userReg.registerUser("John Doe", "USA");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        try {
            userReg.registerUser("Amit Sharma", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
