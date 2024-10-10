public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit(160, "checking");
        System.out.println("Account 1 Checking Balance: " + account1.getCheckingBalance());
        
        System.out.println("***********************************");
        account1.deposit(350, "savings");
        System.out.println("Account 1 Savings Balance: " + account1.getSavingsBalance());
        
        System.out.println("***********************************");
        account2.deposit(1060, "checking");
        System.out.println("Account 2 Checking Balance: " + account2.getCheckingBalance());
        
        System.out.println("***********************************");
        account3.deposit(272, "savings");
        System.out.println("Account 3 Savings Balance: " + account3.getSavingsBalance());
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("***********************************");

        account1.withdraw(200, "checking");
        account1.withdraw(100, "savings");
        System.out.println("Account 1 Checking Balance after withdrawal: " + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance after withdrawal: " + account1.getSavingsBalance());
        System.out.println("***********************************");

        account2.withdraw(1500, "checking");
        System.out.println("Account 2 Checking Balance after withdrawal: " + account2.getCheckingBalance());
        System.out.println("***********************************");

        account3.withdraw(500, "checking");
        System.out.println("Account 3 Checking Balance after withdrawal: " + account2.getCheckingBalance());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("***********************************");
        System.out.println("Number of bank accounts: " + BankAccount.getAccounts());
        System.out.println("Total money in all accounts: $" + BankAccount.getTotalMoney());
    }
}
