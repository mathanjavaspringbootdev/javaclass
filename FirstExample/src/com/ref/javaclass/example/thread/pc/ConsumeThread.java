/**
 * 
 */
package com.ref.javaclass.example.thread.pc;

/**
 * @author Admin
 *
 */
public class ConsumeThread extends Thread {

	private CycleStore store;

	public ConsumeThread(CycleStore obj) {
		this.store = obj;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		this.store.consume();
	}

}