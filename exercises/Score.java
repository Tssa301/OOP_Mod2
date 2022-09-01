package exercises;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ps:No exercício prático não existiam os critérios para cada situação,
        // sendo assim, os-determinei.

        int score;

        System.out.print("Enter your score: ");
        score = sc.nextInt();

        if (score <= 2) {
            System.out.printf("The score is: %d - Insufficient.", score);

        } else if (score <= 4) {
            System.out.printf("The score is: %d - Sufficient.", score);

        } else if (score <= 6) {
            System.out.printf("The score is: %d - Good!", score);

        } else if (score <= 8) {
            System.out.printf("The score is: %d - Notable!", score);

        } else {
            System.out.printf("The score is: %d - Very Good!", score);
        }

        sc.close();
    }
}
