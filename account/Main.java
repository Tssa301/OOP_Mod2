package account;

public class Main {

    public static void main(String[] args) {

        Account acc1 = new Account("Joao Paulo", 0123456, 2500.00);
        Account acc2 = new Account("Maria Jose", 9876543, 3200.00);

        if (acc1.getAccAmount() > acc2.getAccAmount()) {
            System.out.printf("Account 1 - €%.2f has more money than Account 2 - €%.2f", acc1.getAccAmount(),
                    acc2.getAccAmount());
        } else {
            System.out.printf("Account 2 - €%.2f has more money than Account 1 - €%.2f", acc2.getAccAmount(),
                    acc1.getAccAmount());
        }
    }
}
