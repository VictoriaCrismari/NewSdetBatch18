package class19;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount [] accounts={new SavingsAccount("Asghar",46548415,20000),
                new CheckingAccount("Asghar",15008954,1500),
                new FixedDepositAccount("Asghar",65489452,369000)};
        for (int i = 0; i < accounts.length; i++) {
            BankAccount a=accounts[i];
            a.printInfo();
            a.deposit();
            a.withdraw();
        }
    }
}
