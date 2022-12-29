/**
 * 
 */
package com.ref.javaclass.example.thread.sync1;

/**
 * @author Admin
 *
 */
public class Account {
	private int balance = 100;
	
	public void print () {
		System.out.println("Your Account balance is :" + balance);
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void  setBalance(int balance) {
		this.balance = balance;
	}

}
