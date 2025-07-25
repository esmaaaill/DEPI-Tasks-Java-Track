import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("This Program will help to identify if the number is Odd OR Even \n");

        System.out.print("Enter the number: ");

        int num = input.nextInt();
        if (num % 2 ==0)
            System.out.println(" Your number: " + num + " is Even ");

        else
            System.out.println(" Your number: " + num + " is Odd ");
    }
}
