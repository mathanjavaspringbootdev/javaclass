/**
 * 
 */
package com.ref.javaclass.example.thread.sync;

/**
 * @author Admin
 *
 */
public class ThreadSyncObj {
	
	public void print () throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " is in :" + i );
			Thread.sleep(1000);
		}
	}
	public synchronized void printWithSync() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " is in :" + i );
			Thread.sleep(1000);

		}
	}

}
