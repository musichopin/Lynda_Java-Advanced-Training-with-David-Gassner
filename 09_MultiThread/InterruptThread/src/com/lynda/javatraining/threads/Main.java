package com.lynda.javatraining.threads;

public class Main {
//	 when we run a secondary thread it runs to conclusion 
//	or until an exception occurs or 
//	when we explicitly interrupt it from the process that created it

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();

		try {
			Thread.sleep(2500); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.interrupt();
		System.out.println("Called interrupt()");
//		main thread finishes its execution even after 
//		it calls the interrupt method
		
	}

}
/* 
 From secondary thread
From secondary thread
From secondary thread
Called interrupt()
Thread interrupted
// sýra önemli
 */
