package com.lynda.javatraining.threads;

public class MyThread extends Thread {

	private int threadId;
	private TargetClass target;
	
	public MyThread(int threadId, TargetClass target) {
		this.threadId = threadId;
		this.target = target;
	}
	
	@Override
	public void run() {

		synchronized(target) { // other threads would have to wait to use the synchronized method.
			// we prevented the objects from using the shared resource same time.
			// synchronized code block olmasa tüm instancelar ayný anda execute edilirdi 
			// (join metodunun kullanýlmadýðýný farz ediyorum).
			// we pass same target object (reference) into all 3 thread objects 
			// and because we synchronize on that object only one of the threads would be able 
			// to execute this call method at a time.
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			target.call(threadId); // 2 sn gecikmeyle baþlar
		}
		

	}

}
