/**
 * 
 */
package com.ref.javaclass.example.thread.sync1;

/**
 * @author Admin
 *
 */
public class DepositThread extends Thread {
	
	private Account obj;
	public DepositThread(Account obj) {
		this.obj = obj;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {
			int balance = obj.getBalance();
			Thread.sleep(1000);
			balance = balance - 200;
			obj.setBalance(balance);
			obj.print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.print();
	}


}
