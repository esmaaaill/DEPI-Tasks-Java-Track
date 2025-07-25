import java.util.Scanner;

public class Task7 {
    public static void main(String[]args){

        // Print numbers from 1 to 10 using a loop

        System.out.println("This program prints from 1 to 10 using a loop!");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Use if to check the number odd or even

        System.out.println("This program check if the number you enter is even or odd so please enter number to check");
        Scanner input = new Scanner((System.in));
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("The number you enter is Even");
        }else {
            System.out.println("The number you enter is Odd");

        }

        // Use Switch to display the name of the day (1-7) start with Monday

        System.out.println("This program displays the name of th days based on their index starting from Monday");
        System.out.println(" Enter the number of days you want to check");

        int days = input.nextInt();
        switch (days){
            case 1:
                System.out.println("The days you enter is Monday");
                break;
            case 2:
                System.out.println("The days you enter is Tuesday");
                break;
            case 3:
                System.out.println("The days you enter is Wednesday");
                break;
            case 4:
                System.out.println("The days you enter is Thursday");
                break;
            case 5:
                System.out.println("The days you enter is Friday");
                break;
            case 6:
                System.out.println("The days you enter is Saturday");
                break;
            case 7:
                System.out.println("The days you enter is Sunday");
                break;
            default:
                System.out.println("The days you enter is invalid");
                break;
        }
        // Print multiplication table (1-10)
        System.out.println("This program calculate the multiplication number of the number you entered from (1-10):\n");
        int num2 = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println( i*num2 + "\n");
        }

        // Count digits in a number while - ChatGPT Helped me debug this one
        System.out.println("Enter a number to count its digits:");
        int Number = input.nextInt();
        int count = 0;
        while (Number != 0) {
            Number /= 10;
            count++;
        }
        System.out.println("Total digits: " + count);
    }



}
