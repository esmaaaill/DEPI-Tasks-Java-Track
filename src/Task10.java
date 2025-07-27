public class Task10 {
    public static void main(String[] args) {

        System.out.println(" This program is to create a square shape using nested for loop: \n");

        int rows = 3;
        int columns = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
