import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Take password length
        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        // Characters allowed in password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789"
                + "!@#$%^&*";

        String password = "";

        // Generate password
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            password = password + characters.charAt(index);
        }

        // Output
        System.out.println("Generated Password: " + password);

        sc.close();
    }
}