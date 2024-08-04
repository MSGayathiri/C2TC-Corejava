package com.example.banking;

public class Account {
	    private int balance;

	    public Account(int initialBalance) {
	        this.balance = initialBalance;
	    }

	    public synchronized void deposit(int amount) {
	        balance += amount;
	        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", New balance: " + balance);
	    }

	    public synchronized void withdraw(int amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", New balance: " + balance);
	        } else {
	            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ", but insufficient balance.");
	        }
	    }

	    public int getBalance() {
	        return balance;
	    }
	}

