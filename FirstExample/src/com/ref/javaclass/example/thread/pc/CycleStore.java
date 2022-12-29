/**
 * 
 */
package com.ref.javaclass.example.thread.pc;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author Admin
 *
 */
public class CycleStore {

	private LinkedList<String> cycleStore = new LinkedList<>();
	private int count = 0;
	private Random random = new Random();

	public void produce() {
		while (true) {
			synchronized (this) {
				try {
					while (cycleStore.size() == 2)
                        wait();
					String cycleName = "Cycle " + count++;
					cycleStore.add(cycleName);
					System.out.println(cycleName + " is produced");
					notify();
					Thread.sleep(random.nextInt(10) * 1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void consume() {
		while (true) {
			synchronized (this) {
				try {
					while (cycleStore.size() == 0)
                        wait();
					String cycleName = cycleStore.getFirst();
					System.out.println(cycleName + " is consumed");
					cycleStore.remove(cycleName);
					notify();
					Thread.sleep(random.nextInt(10) * 1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					try {
						Thread.sleep(random.nextInt(10) * 1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		}
	}
}
