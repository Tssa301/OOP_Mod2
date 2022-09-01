package exercises;

public class MultiplicationTable {

    public static void main(String[] args) {

        int sum;
        int multiplier = 9;

        System.out.println("Multiplication table by 9:");

        for (int multiplied = 1; multiplied < 11; multiplied++) {
            sum = multiplier * multiplied;

            System.out.printf("9x%d = %d \n", multiplied, sum);
        }
    }
}