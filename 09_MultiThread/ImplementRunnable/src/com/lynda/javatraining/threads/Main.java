package com.lynda.javatraining.threads;

public class Main {

	public static void main(String[] args) {
	
		int iterations = 3;
		
		MyThread thread = new MyThread();
		thread.start();
		
		MyRunnable runnable = new MyRunnable();
		Thread thread2 = new Thread(runnable);
		thread2.start();
//		alt:
//		new Thread(new MyRunnable()).start();
//		new Thread and new MyRunnable becomes anonymous since we do
//		not assign a name (ref variable). we only need to instantiate and use 
//		them long enough to call the start method and then we are done with it
		
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("from main process");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		System.out.println("Terminated");
	}

}
/*
 From secondary thread
from main process
From runnable
From runnable
From secondary thread
from main process
From runnable
From secondary thread
From runnable
from main process
From secondary thread
From runnable
From secondary thread 
Terminated
 */
