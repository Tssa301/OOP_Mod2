package exercises;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password;
        int counter = 1;

        System.out.print("Enter the password: ");
        password = sc.next();

        while (!password.equals("password123") && counter <= 2) {

            System.out.println("Incorrect password, Try again!! \nRemaining attempts: " + (3 - counter));
            counter++;
            password = sc.next();

        }

        if (password.equals("password123")) {

            System.out.println("PERMITTED ACCESS!");

        } else {

            System.out.println("Access Denied!!! The program is being terminated.");
        }

        sc.close();
    }
}
