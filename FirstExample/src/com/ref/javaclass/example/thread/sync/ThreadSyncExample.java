/**
 * 
 */
package com.ref.javaclass.example.thread.sync;

/**
 * @author Admin
 *
 */
public class ThreadSyncExample {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("With out Syncronization");
		ThreadSyncObj obj = new ThreadSyncObj();
		Thread t1 = new ThreadSync(obj);
		Thread t2 = new ThreadSync(obj);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("With Syncronization");
		t1 = new ThreadSync2(obj);
		t2 = new ThreadSync2(obj);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("With SyncronizationBlock");
		t1 = new ThreadSync3(obj);
		t2 = new ThreadSync3(obj);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("With SyncronizationBlock");
		t1 = new ThreadSync4(obj);
		t2 = new ThreadSync(obj);
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
