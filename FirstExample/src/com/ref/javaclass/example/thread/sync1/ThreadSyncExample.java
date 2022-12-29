/**
 * 
 */
package com.ref.javaclass.example.thread.sync1;

/**
 * @author Admin
 *
 */
public class ThreadSyncExample {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account obj = new Account();
		Thread t1 = new DepositThread(obj);
		Thread t2 = new WithdrawalThread(obj);
		Thread t3 = new DepositThread(obj);
		Thread t4 = new DepositThread(obj);
		Thread t5 = new WithdrawalThread(obj);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Final Balance:::" + obj.getBalance());
	}

}
