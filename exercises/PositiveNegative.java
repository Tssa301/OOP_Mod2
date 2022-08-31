package exercises;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        if (number >= 1) {
            System.out.printf("The number is positive: %d", number);

        } else if (number < 0) {
            System.out.printf("The number is negative: %d", number);

        } else {
            System.out.printf("Neutral number: %d", number);
        }

        sc.close();
    }
}
