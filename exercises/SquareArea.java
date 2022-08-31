package exercises;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, L;

        System.out.print("Enter the square area: ");
        L = sc.nextInt();

        // Formula
        A = L * L;

        System.out.printf("The square area is: %dm2", A);

        sc.close();
    }
}
