import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence : \n");
        String txt = input.nextLine();


        System.out.println(txt.toUpperCase());

        System.out.println(txt.length());

    }
}
