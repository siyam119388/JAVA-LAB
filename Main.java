/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;
public class Main {
    public static void main(String[] args) {
        try {
            // Create a new account with a positive initial balance
            Account account1 = new Account("12345", 1000.0);
            System.out.println("Account created with number: " + account1.getAccountNumber() + " and balance: " + account1.getBalance());

            // Deposit money
            account1.deposit(500.0);
            System.out.println("Deposited 500.0, new balance: " + account1.getBalance());

            // Withdraw money
            account1.withdraw(200.0);
            System.out.println("Withdrew 200.0, new balance: " + account1.getBalance());

            // Attempt to withdraw more money than the balance
            try {
                account1.withdraw(1500.0);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }

            // Attempt to create an account with a negative initial balance
            try {
                Account account2 = new Account("67890", -100.0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Attempt to deposit a negative amount
            try {
                account1.deposit(-50.0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Execution of main method complete.");
        }
    }
}
