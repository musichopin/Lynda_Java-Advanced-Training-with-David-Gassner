package com.lynda.javatraining.threads;

public class Main {

	public static void main(String[] args) {
		// we use a single object to synchronize multiple instances of MyThread thread
		TargetClass target = new TargetClass();
		
		MyThread t1 = new MyThread(1, target);
		MyThread t2 = new MyThread(2, target);
		MyThread t3 = new MyThread(3, target);
		
		t1.start();
		t2.start(); // it is up to the virtual machine whether t2 or t3 executes first
		t3.start();
		
//		there are many apps where multiple threads might need to 
//		share the same resource. 
//		we need to synchronize these threads so that only 1 thread at a time 
//		has access to that resource. 
		
	}

}
/*
Calling thread from 1
Calling thread from 3
Calling thread from 2 
 */
