import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you age: \n");
        int age = input.nextInt();
        System.out.println("Enter your name: \n");
        String name = input.next();
        System.out.println("Enter your programming language: \n");
        String language = input.next();
        int months = age * 12;
        int age2= age ++;
        System.out.println("Hello! My name is " + name + "\n" + "I am " + age + " years old.\n" + "Which is " + months + " months\n" + "My favourite programming language is " + language + "\n" + "next year I will be " + age2 + " years old.\n" );




    }
}
