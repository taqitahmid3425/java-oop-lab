// Exercise 2 — Bank Account
// Create a class BankAccount with private fields accountNumber, accountHolder, and balance.
// Requirements:
// The balance cannot be changed directly.
// Implement deposit(double amount).
// Implement withdraw(double amount).
// Deposits must be positive.
// Withdrawal cannot exceed the current balance.
// Provide a getter for the balance but .

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountHolder() {
        return this.accountHolder;
    }

    int getAccountNumber() {
        return this.accountNumber;
    }

    double getBalance() {
        return this.balance;
    }

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance() {
        System.out.println("Setting failed for account number: " + accountNumber);
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successfull for account number: " + accountNumber);
        } else {
            System.out.println("Deposit Unsuccessfull for account number: " + accountNumber);
        }
    }

    void withdraw(int amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successfull for account number: " + accountNumber);
        } else {
            System.out.println("Insufficient Balance for account number: " + accountNumber);
        }
    }

    void checkBalance() {
        System.out.println();
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("taqi", 238649, 20000);
        BankAccount acc2 = new BankAccount("tahmid", 392435, 45000);

        acc1.checkBalance();
        acc2.checkBalance();

        System.out.println();
        acc1.deposit(577);
        acc1.withdraw(500000);
        acc1.checkBalance();
    }
}
