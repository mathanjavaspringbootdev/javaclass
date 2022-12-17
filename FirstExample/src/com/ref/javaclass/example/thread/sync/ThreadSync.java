/**
 * 
 */
package com.ref.javaclass.example.thread.sync;


/**
 * @author Admin
 *
 */
public class ThreadSync extends Thread {
	
	private ThreadSyncObj obj;
	public ThreadSync(ThreadSyncObj obj) {
		this.obj = obj;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {
			obj.print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
