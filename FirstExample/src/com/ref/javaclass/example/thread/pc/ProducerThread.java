/**
 * 
 */
package com.ref.javaclass.example.thread.pc;

/**
 * @author Admin
 *
 */
public class ProducerThread extends Thread {
	
	private CycleStore store;
	public ProducerThread(CycleStore obj) {
		this.store = obj;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		this.store.produce();
	}


}
