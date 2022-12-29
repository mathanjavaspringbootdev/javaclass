/**
 * 
 */
package com.ref.javaclass.example.thread.sync;

/**
 * @author Admin
 *
 */
public class ThreadSyncObj {

	public ThreadSyncObj() {
	}
	
	public void print() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " is in :" + i);
			Thread.sleep(1000);
		}
	}

	public synchronized void printWithSync() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " is in :" + i);
			Thread.sleep(1000);

		}
		System.out.println("Method printWithSync going to end");
		Thread.sleep(3000);
		System.out.println("Method printWithSync end");
	}

	public void printWithSyncBlock() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread: " + Thread.currentThread().getName() + " is in :" + i);
				Thread.sleep(1000);
			}
		}
		System.out.println("Method printWithSyncBlock going to end");
		Thread.sleep(3000);
		System.out.println("Method printWithSyncBlock end");
	}
	
	public synchronized void printWithSyncWithComm() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " is in :" + i);
			this.wait(1000);
		}
		System.out.println("Method printWithSync going to end");
		Thread.sleep(3000);
		System.out.println("Method printWithSync end");
		this.notify();
	}

}
