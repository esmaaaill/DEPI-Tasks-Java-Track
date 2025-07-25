import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" This program will help you to find your character grade \n");
        System.out.println(" Please enter your grade Character in Capital: \n");

        String grade = input.nextLine();

       switch (grade){
           case "A" :
               System.out.println(" Excellent ");
               break;
           case "B" :
               System.out.println(" Very Good ");
               break;
           case "C" :
               System.out.println(" Good ");
               break;
           case "D" :
               System.out.println(" Pass ");
               break;
           case "F" :
               System.out.println(" Fail ");
               break;
           default:
               System.out.println("Invalid Grade ");
       }
    }
}
