package service;

import model.BankAccount;

import java.util.Scanner;

public class BankAccountService {
    public Float credit(BankAccount account) {
        Scanner deposit = new Scanner(System.in);

        Float balance = account.getBalance();

        System.out.print("Enter the amount of the deposit: ");
        float credit = Float.parseFloat(deposit.nextLine());

        balance += credit;

        account.setBalance(balance);

        return balance;
    }

    public Float debit(BankAccount account) {
        Scanner deposit = new Scanner(System.in);

        Float balance = account.getBalance();

        System.out.print("Enter the amount that you want to debit: ");
        float debit = Float.parseFloat(deposit.nextLine());

        if (balance > debit) {
            balance -= debit;

            account.setBalance(balance);
        } else {
            System.out.println("The credit is greater than the balance, your current balance is: " + balance);
            System.out.println();
        }

        return balance;
    }
}
