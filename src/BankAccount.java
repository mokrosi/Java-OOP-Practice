// Task 6: Encapsulation
// Create a class `BankAccount` with:
// - Private variables: `accountNumber` (String), `balance` (double)
// - Getter and setter methods for both fields.
// - In `main()`, create an object, set values, and print them using getters.

public class BankAccount {
    
    private String accountNumber ;
    private double balance ;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1", 200);
        BankAccount account2 = new BankAccount("2", 500);
        
        account1.setBalance(300);

        System.out.println("accounts : ");
        System.out.println("account Number : " + account1.getAccountNumber());
        System.out.println("account balance : " + account1.getBalance());
        System.out.println("---------");
        System.out.println("account Number : " + account2.getAccountNumber());
        System.out.println("account balance : " + account2.getBalance());
    }



}
