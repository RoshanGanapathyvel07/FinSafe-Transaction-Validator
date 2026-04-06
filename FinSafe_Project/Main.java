import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(1000, "Roshan");

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View History");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextInt());
                } else if (choice == 2) {
                    System.out.print("Enter amount: ");
                    acc.processtransaction(sc.nextInt());
                } else if (choice == 3) {
                    acc.printstatement();
                } else if (choice == 4) {
                    System.out.println("Thank you!");
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InsufficientException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
