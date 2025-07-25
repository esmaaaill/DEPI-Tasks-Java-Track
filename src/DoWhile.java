import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        System.out.println("This program confirms your password.");
        System.out.print("\nEnter your password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        int trials = 0;
        String password2;

        do {
            System.out.print("\nConfirm your password: ");
            password2 = input.nextLine();
            trials++;

            if (!password.equals(password2)) {
                System.out.println("\nPasswords do not match - Please try again.");

            }
        } while (!password.equals(password2));

        System.out.println("Password confirmed successfully!");

        input.close();
    }
}