//summary: 
//we create our own custom class that extends thread
//add our own functionality to the custom run method
//and then instantiate the class and start it from our main process
package com.lynda.javatraining.threads;

public class Main {

	public static void main(String[] args) {
	
		int iterations = 3;
		
		MyThread thread = new MyThread();
		
		thread.start(); // calls the start method of MyThread and runs the thread
		
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("from main process"); 
				Thread.sleep(3000); 
//				this time we call sleep method as a static method
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
	}

}
/*
from main process
From secondary thread
From secondary thread
from main process
From secondary thread
From secondary thread
from main process
From secondary thread
*/