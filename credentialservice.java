package credentials;

import java.util.Random;

public class credentialservice {
    private static final String SHANCOMPANYLTD = "SHANCOMPANY.com";
    private static final String[] DEPARTMENTS = {"Technical", "Admin", "HumanResource", "Legal"};

    public static String generateEmailAddress(employee employee) {
        String email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() +
                "@" + employee.getDepartment().toLowerCase() + "." + SHANCOMPANYLTD;
        return email;
    }

    public static String generatePassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void showCredentials(employee employee) {
        String email = generateEmailAddress(employee);
        String password = generatePassword();

        System.out.println("Generated Credentials:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
