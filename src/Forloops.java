import java.util.Scanner;

public class Forloops {
    public static void main(String[] args) {

        System.out.println("\n This program to print the multiplication table of any number you want from th range of 1 : 10  ");
        System.out.println(" Please enter the Multiplication number : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " x " + x + " = " + (i * x));
            i++;
        }
    }
}
