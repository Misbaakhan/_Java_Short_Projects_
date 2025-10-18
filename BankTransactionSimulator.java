import java.util.Scanner;

class Account {
    long accountNumber;
    double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("total amount after deposit is" + balance);

    }

    public void displayBalance() {
        System.out.println("Account Number : " + accountNumber + "Balance : " + balance);
    }

}

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }

}

class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        amount = sc.nextInt();
        if (amount > balance) {
            throw new InsufficientBalanceException("insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("withdrawal successfull " + amount);
        }

    }

}

class CurrentAccount extends Account {
    double overdraftLimit = 5000;

    public CurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        amount = sc.nextInt();
        if (amount > balance + overdraftLimit) {
            throw new InsufficientBalanceException("insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("withdrawal successfull " + amount);
        }

    }
}

public class BankTransactionSimulator {
    public static void main(String[] args) {
        try {
            Account acc1 = new SavingsAccount(101, 2000.6);
            acc1.withdraw(2500.5);
            
            Account acc2 = new CurrentAccount(102, 1000.5);
            acc2.withdraw(5500.6);
            
            acc2.displayBalance();
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }

}
