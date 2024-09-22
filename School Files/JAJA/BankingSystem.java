import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: ₱" + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: ₱" + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance for " + accountHolderName + ": ₱" + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name to create an account: ");
        String accountHolderName = scanner.nextLine();

        BankAccount userAccount = new BankAccount(accountHolderName);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    userAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the banking system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}