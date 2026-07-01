package package1;
public class BankAccount {
    private final String AccHolder;
    private final int AccNumber;
    private double balance;

    public BankAccount (String AccHolder,int AccNumber, double balance) {
        this.AccHolder=AccHolder;
        this.AccNumber=AccNumber;
        this.balance=balance;
    }

//    DEPOSIT
    public void deposit (double amount ) {
        this.balance +=  amount;
    }

//    WITHDRAW
    public void withdraw (double amount ) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

//    display
    public void display () {
        System.out.println("********************************");
        System.out.println("Displaying Bank Details");
        System.out.println("********************************");
        System.out.println("Account Name = "+ this.AccHolder);
        System.out.println("Account Number = "+ this.AccNumber);
        System.out.printf("Account Balance = %.2f\n", this.balance);
        System.out.println("********************************");
    }
}