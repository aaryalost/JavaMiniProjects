import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 10000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited ₹" + deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn ₹" + withdraw);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
