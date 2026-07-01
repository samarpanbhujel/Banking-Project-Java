package package1;
public class BankAccount {
    private final String accHolder;
    private final String accNumber;
    private double balance;

    public BankAccount (String accHolder,String accNumber, double balance) {
        this.accHolder=accHolder;
        this.accNumber=accNumber;
        this.balance=balance;
    }

//    DEPOSIT
    public void deposit (double amount ) {
        this.balance +=  amount;
    }

//    WITHDRAW
    public void withdraw (double amount ) {
            this.balance -= amount;
    }

//    display
    public void display () {
        System.out.println("********************************");
        System.out.println("Displaying Bank Details");
        System.out.println("********************************");
        System.out.println("Account Name = "+ this.accHolder);
        System.out.println("Account Number = "+ this.accNumber);
        System.out.printf("Account Balance = %.2f\n", this.balance);
        System.out.println("********************************");
    }
}