import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(" This program will help you to identify voting eligibilty based on nationality and  age");
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter your nationality");
        String nationality = input.nextLine();
        System.out.println(" Please enter your age");
        int age = input.nextInt();

        if (age >= 18 && nationality.equals("Egyptian"))
            
            System.out.println(" So You Can Vote");

        else
            System.out.println(" You Can not Vote");



    }
}
