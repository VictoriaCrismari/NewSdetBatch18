package class19;

public class BankAccount {
    /*2)Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.

    Common attributes might include accountNumber, balance, and accountHolderName.
    Override methods like withdraw and deposit in each subclass to handle specific rules.
    Introduce unique methods like applyInterest in SavingsAccount.
    Create objects of each type, store them in a list, and perform operations like depositing and withdrawing funds.*/
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountHolderName,int accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void printInfo(){
        System.out.println(accountHolderName+" "+accountNumber+" "+balance);
    }
    void deposit(){
        System.out.println("Money is being deposited into account");
    }
    void withdraw(){
        System.out.println("Funds are withdrawn from the account");
    }

}
class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName,int accountNumber,double balance){
        super(accountHolderName, accountNumber, balance);
    }
    void deposit(){
        System.out.println("Money is being deposited into savings account");
    }
    void withdraw(){
        System.out.println("Funds are withdrawn from the savings account");
    }
    void applyInterest(){
        System.out.println("There is an interest being charged for the balance in your account");
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountHolderName,int accountNumber,double balance){
        super(accountHolderName, accountNumber, balance);
    }
    void withDrawLimit(){
        System.out.println("Your daily limit is 500$");
    }
    void deposit(){
        System.out.println("Money is being deposited into checking account");
    }
    void withdraw(){
        System.out.println("Funds are withdrawn from the checking account");
    }
}
class FixedDepositAccount extends BankAccount{
    public FixedDepositAccount(String accountHolderName,int accountNumber,double balance){
        super(accountHolderName, accountNumber, balance);
    }
    void deposit(){
        System.out.println("Money is being deposited into the fixed deposit account");
    }
    void withdraw(){
        System.out.println("Funds are withdrawn from the fixed deposit account");
    }
    void depositLimit(){
        System.out.println("You can only deposit 2000$ at a time");
    }
}