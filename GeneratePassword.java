import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class GeneratePassword {
    public static void main(String[] args) {
        String rawPassword = "admin123"; // Change to your desired password
        try {
            String hashedPassword = hashPassword(rawPassword);
            System.out.println("Hashed Password: " + hashedPassword);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error generating password hash: " + e.getMessage());
        }
    }
    
    private static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encodedHash);
    }
}