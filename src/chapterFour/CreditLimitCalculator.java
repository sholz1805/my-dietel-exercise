package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {

    private int acctNumber;
    private int balance;
    private int totalCharged;
    private int totalCredit;
    private int creditLimit;


    public CreditLimitCalculator(int acctNumber, int balance, int totalCharged, int totalCredit, int creditLimit) {

        this.acctNumber = acctNumber;
        this.balance = balance;
        this.totalCharged = totalCharged;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;

    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotalCharged() {
        return totalCharged;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int customer = 0;
        do{

        System.out.println("Enter acc num");
        int acc = scanner.nextInt();

        System.out.println("Enter opening balance");
        int bal = scanner.nextInt();

        System.out.println("Enter total charges");
        int charges = scanner.nextInt();

        System.out.println("Enter total credit");
        int credit = scanner.nextInt();

        System.out.println("Enter credit limit");
        int crLimit = scanner.nextInt();

        CreditLimitCalculator sample = new CreditLimitCalculator(acc, bal, charges, credit, crLimit);


        int newBalance = bal + charges - credit;

        {
                if (newBalance > crLimit){
                    System.out.println("Credit limit exceeded");}
                else
                    System.out.println("Your account number is: " + acc );
                    System.out.println("Your opening balance is: " + bal);
                    System.out.println("Total charge for your items is: " + charges);
                    System.out.println("Total credit used is: " + credit);
                    System.out.println("Your credit Limit is: " + crLimit);

            System.out.println("Your new balance is: " + newBalance);
            System.out.println();
            }
            customer++;
        }
        while (customer <= 3);

        }
    }
