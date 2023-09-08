package credentials;

public class Main {
    public static void main(String[] args) {
        employee newHire = new employee("Roshan", "Shankar");
        newHire.setDepartment("Technical");

        credentialservice.showCredentials(newHire);
    }
}
