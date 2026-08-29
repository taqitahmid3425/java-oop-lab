class BankAccount {
    int accountNumber;
    int balance;

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit Successfull");
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successfull");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Your current balance of account number " + accountNumber + " is " + balance + "/-");
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 23234543;
        acc1.balance = 1000;
        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = 23234544;
        acc2.balance = 4000;

		acc1.displayBalance();
		acc2.displayBalance();
        acc1.withdraw(400);
        acc2.deposit(400);
		acc1.displayBalance();
		acc2.displayBalance();
    }
}