package exercises;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, count = 0;

        System.out.print("Enter a number and make sure it's a Prime number: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // O count armazena quantas vezes o resultado foi true(0)
            }
        }

        if (count == 2) {
            System.out.printf("The number %d is Prime.", number);
        } else {
            System.out.printf("The number %d is Not Prime.", number);
        }

        sc.close();
    }
}
