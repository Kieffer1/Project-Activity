import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }

    void checkBalance() {
        System.out.println("Account Balance for " + accountHolderName + ": " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolderName, double interestRate) {
        super(accountHolderName);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        double interestEarned = balance * interestRate;
        balance += interestEarned;
        System.out.println("Interest applied. Current balance: " + balance);
    }

    @Override
    void checkBalance() {
        super.checkBalance();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

class InheritanceBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Terminal Banking System!");
        System.out.print("Enter your name to create an account: ");
        String accountHolderName = scanner.nextLine();

        SavingsAccount userAccount = new SavingsAccount(accountHolderName, 0.0);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Apply Interest\n5. Exit");
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
                    System.out.print("Enter interest rate for savings account: ");
                    double interestRate = scanner.nextDouble();
                    userAccount.applyInterest();
                    break;
                case 5:
                    System.out.println("Exiting the banking system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
