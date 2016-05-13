package com.lynda.javatraining.threads;

// we create a class that can be used as a target object
public class TargetClass {
	public void call(int threadId) {
		System.out.println("Calling thread from " + threadId);
	}
}
