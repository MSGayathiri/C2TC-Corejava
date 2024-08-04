package com.example.banking;

public class BankingSystem {
	public static void main(String[] args) {
        Account account = new Account(1000);

        Thread t1 = new Thread(new Transaction(account, true, 500), "Customer1");
        Thread t2 = new Thread(new Transaction(account, false, 300), "Customer2");
        Thread t3 = new Thread(new Transaction(account, false, 800), "Customer3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }

}
