package com.lynda.javatraining.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int iterations = 5;
		
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("From runnable");
				Thread.sleep(1500); 
				// we don't have direct access to the sleep method of Thread class
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}

}
