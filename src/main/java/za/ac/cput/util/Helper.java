package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    //Method to auto generate employeeId UUID
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    // Method to check if a string is null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Method to validate email using regex
    public static boolean isValidEmail(String email) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if (email == null) {
            return false;
        }
        return email.matches(emailRegex);
    }
}
