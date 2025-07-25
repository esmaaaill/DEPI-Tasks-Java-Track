import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" This program allow you to enter two numbers to mae multiple calculation operations on them\n");
        System.out.println(" Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println(" Here is the calculation operations on them: \n");
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double division = num1 / num2;
        System.out.println(" The Sum result is: " + sum);
        System.out.println(" The Difference result is: " + difference);
        System.out.println(" The Product result is: " + product);
        System.out.println(" The Quotient result is: " + division);
    }
}
