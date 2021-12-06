package chapterThree;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {

        Account firstAccount = new Account("Shola Azeez", 70.00);
        Account secondAccount = new Account("Muri Okunola", 0.00);



        Scanner input = new Scanner (System.in);

        System.out.print("Enter deposit amount for Shola's Account: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to firstAccount balance%n%n", depositAmount);
        firstAccount.deposit(depositAmount);

        System.out.printf("%s balance: #%.2f%n",
                firstAccount.getName(), firstAccount.getBalance());
        System.out.printf("%s balance: #%.2f%n",
                secondAccount.getName(), secondAccount.getBalance());

        System.out.print("Enter deposit amount for Muri's Account : ");
        depositAmount = input.nextDouble();
        System.out.printf("%adding %.2f to Muri's balance%n%n",
                depositAmount);
        secondAccount.deposit(depositAmount);

        System.out.printf("%n%s balance : #%.2f%n",
                firstAccount.getName(), firstAccount.getBalance());
        System.out.printf("%s balance : #%.2f%n%n",
                secondAccount.getName(), secondAccount.getBalance());



        System.out.print("Enter withdrawal amount for Shola's Account : ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%n removing %.2f from Shola's Account %n%n",
                withdrawalAmount);
        firstAccount.withdrawal(withdrawalAmount);
        System.out.printf("%n%s balance : #%.2f%n",
                firstAccount.getName(), firstAccount.getBalance());


        System.out.print("Enter withdrawal amount for Muri's Account : ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%n removing %.2f from %s Account %n",
                withdrawalAmount, secondAccount.getName());
        secondAccount.withdrawal(withdrawalAmount);


        System.out.printf("%s balance : #%.2f%n%n",
                secondAccount.getName(), secondAccount.getBalance());

    }
}
