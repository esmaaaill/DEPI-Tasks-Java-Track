public class Task9 {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};

        System.out.println(" This Program to calculate the averge and maximum from the Given Array already\n");
        int maxScore = findMaxScore(scores);
        System.out.println("Maximum Score: " + maxScore);


        double average = calcavg(scores);
        System.out.println("Average Score: " + average);


        int searchValue = 92;
        int index = searchScore(scores, searchValue);
        if (index != -1) {
            System.out.println("Score " + searchValue + " found at index: " + index);
        } else {
            System.out.println("Score " + searchValue + " not found.");
        }
    }
    public static int findMaxScore(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
    public static double calcavg(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
    public static int searchScore(int[] scores, int value) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == value) {
                return i;
            }
        }
        return -1;
    }
}