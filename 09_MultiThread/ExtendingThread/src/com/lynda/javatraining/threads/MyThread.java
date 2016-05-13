package com.lynda.javatraining.threads;

// we don't need special import statement since
// Thread class is a member of java.lang package
public class MyThread extends Thread {

	@Override
	public void run() {
//		run method returns void and is called automatically whenever 
//		we start our new thread. most important thing is that we 
//		implement the run method. run method is called whenever we 
//		instantiate and run our thread
		int iterations = 5;
		
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("From secondary thread");
				sleep(2000); // sleep method belongs to Thread class
//				after the output we pause the execution for 2 seconds
			}
		} catch (InterruptedException e) {
//			an interruped exception is thrown whenever the thread is interrupted.
//			by surrounding the entire for loop, if an exception happens we jump out 
//			of the for loop automatically
			System.err.println(e);
//			 kýrmýzý yazýyla print eder hata olursa
		}
		
	}

}
