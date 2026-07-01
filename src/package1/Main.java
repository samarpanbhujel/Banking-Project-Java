package package1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Name");
        String AccHolder = sc.nextLine();
        System.out.println("Enter Account Number");
        int AccNumber = sc.nextInt();
        System.out.println("enter your Balance: ");
        double balance = sc.nextDouble();
        double amount;
        boolean isrunning=true;

        BankAccount obj;
        obj = new BankAccount(AccHolder, AccNumber, balance);
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter amount");
                    amount = sc.nextDouble();
                    obj.deposit(amount);
                    break;
                case 2:
                    System.out.println("enter amount");
                    amount = sc.nextDouble();
                    obj.withdraw(amount);
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    isrunning=false;
                    System.out.println("********************************");
                    System.out.println("Thank You, Have A Good Day ╰(*°▽°*)╯");
                    System.out.println("********************************");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (isrunning);
    }
}
