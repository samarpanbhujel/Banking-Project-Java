package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accHolder="";
        String accNumber="";
        double balance=0.00;
        boolean validInput=false;
        // using Try and Catch with loops to validate user input
        while (!validInput) {
            try {
                System.out.println("Enter Account Name");
                accHolder = sc.nextLine();
                System.out.println("Enter Account Number");
                accNumber = sc.next();
                System.out.println("enter your Balance: ");
                balance = sc.nextDouble();
                if (balance>=0) {
                    validInput=true;
                }
                else {
                    System.out.println("Invalid Balance");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                sc.next(); // to consume bad user input
            }
        }
        double amount;
        boolean isrunning=true;

        BankAccount obj;
        obj = new BankAccount(accHolder, accNumber, balance);
        while (isrunning) {
            boolean validInput2=false;
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("enter your choice");
            int choice=0;
            // using Try and Catch with loops to validate user input
            while (!validInput2) {
                try {
                    choice = sc.nextInt();
                    validInput2=true;
                }
                catch (InputMismatchException e2) {
                    System.out.println("Invalid Input! Try Again");
                    sc.next(); // to consume bad user input
                }
            }


            switch (choice) {
                case 1:
                    System.out.println("enter amount");
                    amount = sc.nextDouble();
                    if (amount>=0) {
                        obj.deposit(amount);
                    }
                    else {
                        System.out.println("Amount must be positive");
                    }
                    break;
                case 2:
                    System.out.println("enter amount");
                    amount = sc.nextDouble();
                    if (amount>=0) {
                        obj.withdraw(amount);
                    }
                    else {
                        System.out.println("Amount must be positive");
                    }
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
        }
    }
}
