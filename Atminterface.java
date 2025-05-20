package Javapjs;

import java.util.Scanner;

public class Atminterface {
    static int balance = 500000;
    static Scanner sc = new Scanner(System.in);

    public static void deposit() {
        System.out.println("Enter amount to deposit: ");
        int depo = sc.nextInt();
        balance += depo;
        System.out.println("Deposit Successful...");
    }

    public static void withdraw() {
        System.out.println("Enter amount to withdraw: ");
        int wd = sc.nextInt();
        if (balance > wd) {
            balance -= wd;
            System.out.println("Withdrawal Successful...!!!");
        } else {
            System.out.println("No sufficient funds");
        }
    }

    public static void checkbalance() {
        System.out.println("Your balance is: " + balance);
    }

    public static void exit() {
        System.out.println("Thanks for Banking with us.....!!!!");
        sc.close();
        System.exit(0);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Select the Operation to Perform: ");
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit....!!!");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkbalance();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

