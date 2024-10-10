import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private String accountNumber; //ninja Bonus
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = generateAccountNumber(); // Ninja Bonus
        accounts++; 
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equals("checking")) {
                checkingBalance += amount;
            } else if (accountType.equals("savings")) {
                savingsBalance += amount;
            } else {
                System.out.println("Invalid account type");
                return;
            }
            totalMoney += amount; 
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equals("checking")) {
                if (checkingBalance >= amount) {
                    checkingBalance -= amount;
                    totalMoney -= amount;
                } else {
                    System.out.println("Insufficient funds");
                }
            } else if (accountType.equals("savings")) {
                if (savingsBalance >= amount) {
                    savingsBalance -= amount;
                    totalMoney -= amount;
                } else {
                    System.out.println("Insufficient funds");
                }
            } else {
                System.out.println("Invalid account type");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance() {
        return checkingBalance + savingsBalance;
    }
    
    //ninja bonus
    private String generateAccountNumber() {
        Random rand = new Random();
        String accountNum = ""; 
        for (int i = 0; i < 10; i++) {
            int randomDigit = rand.nextInt(10); 
            accountNum += randomDigit;
        }

        return accountNum;
    }
}
