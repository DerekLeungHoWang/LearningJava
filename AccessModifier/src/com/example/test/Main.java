package com.example.test;

public class Main {

    public static void main(String[] args) {
	    Account timsAccount = new Account("Tim");
	    timsAccount.deposit(1000);
	    timsAccount.withDraw(500);
	    timsAccount.withDraw(-200);;
	    timsAccount.deposit(-20);
	    timsAccount.calculateBalance();

        System.out.println("Balance on account is " + timsAccount.getBalance());
         timsAccount.calculateBalance();
    }
}
