import java.util.Scanner;

class BankAccount {
    private double balance; // private is used to hide the data from outside world

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount account;
    private int userPIN; // Simple PIN-based authentication

    public ATM(BankAccount account, int userPIN) {
        this.account = account;
        this.userPIN = userPIN;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int enteredPIN = sc.nextInt();

        if (enteredPIN == userPIN) {
            System.out.println("Authentication successful.");
            displayMenu(sc);
        } else {
            System.out.println("Authentication failed. Exiting...");
        }
    }

    public void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount:  ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using HK ATM.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Atm_interface {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 10000
        BankAccount account = new BankAccount(10000);

        // Set a PIN for user authentication
        int userPIN = 9810;

        // Create an ATM instance and run the ATM program
        ATM atm = new ATM(account, userPIN);
        atm.run();
    }
}
