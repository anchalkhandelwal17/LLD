package lld.ATMMachine;

public class Account {
    // balance, accountNumber
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private AccountType accountType;

    public Account(int accountNumber, double balance, String accountHolderName, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
