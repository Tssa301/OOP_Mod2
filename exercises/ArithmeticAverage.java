package exercises;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1, x2, x3, x4, x5, x6, aritAverage;

        System.out.println("Enter the arithmetic average:");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        x4 = sc.nextDouble();
        x5 = sc.nextDouble();
        x6 = sc.nextDouble();

        // Fórmula média aritmética simples
        aritAverage = (x1 + x2 + x3 + x4 + x5 + x6) / 6;

        // printf -> Um método de conveniência para gravar uma string formatada e os
        // argumentos de formato especificados.
        System.out.printf("The arithmetic average is: %.1f\n", aritAverage);

        sc.close();
    }
}