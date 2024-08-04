package com.example.banking;


	public class Transaction implements Runnable {
	    private Account account;
	    private boolean deposit;
	    private int amount;

	    public Transaction(Account account, boolean deposit, int amount) {
	        this.account = account;
	        this.deposit = deposit;
	        this.amount = amount;
	    }

	    @Override
	    public void run() {
	        if (deposit) {
	            account.deposit(amount);
	        } else {
	            account.withdraw(amount);
	        }
	    }
	}

