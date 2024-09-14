import java.util.Scanner;

public class AgeValidation {
    public static final int AGE_LIMIT = 18;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}
