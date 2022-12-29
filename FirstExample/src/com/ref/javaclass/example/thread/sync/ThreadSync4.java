/**
 * 
 */
package com.ref.javaclass.example.thread.sync;


/**
 * @author Admin
 *
 */
public class ThreadSync4 extends Thread {
	
	private ThreadSyncObj obj;
	public ThreadSync4(ThreadSyncObj obj) {
		this.obj = obj;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {
			obj.printWithSyncWithComm();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
