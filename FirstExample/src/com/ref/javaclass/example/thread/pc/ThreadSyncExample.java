/**
 * 
 */
package com.ref.javaclass.example.thread.pc;

/**
 * @author Admin
 *
 */
public class ThreadSyncExample {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CycleStore obj = new CycleStore();
		Thread t1 = new ProducerThread(obj);
		Thread t2 = new ConsumeThread(obj);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
