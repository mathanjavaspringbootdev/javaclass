/**
 * 
 */
package com.ref.javaclass.example.thread.sync;


/**
 * @author Admin
 *
 */
public class ThreadSync2 extends Thread {
	
	private ThreadSyncObj obj;
	public ThreadSync2(ThreadSyncObj obj) {
		this.obj = obj;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {
			obj.printWithSync();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
