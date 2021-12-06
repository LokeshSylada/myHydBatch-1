package com.technoelevate.multithreading;

public class MyThread {

	public static void main(String[] args) {
		System.out.println("Hello from main thread.");
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.start();

//		new Thread() {
//			public void run() {
//				System.out.println("Hello from anonymous class thread" + Thread.currentThread().getName());
//			}
//		}.start();

		MyRunnable myrunnnable = new MyRunnable();

		Thread myRunnableThread = new Thread(myrunnnable);

//		Thread myRunnableThread = new Thread(new MyRunnable() {
//
//			@Override
//			public void run() {
//				System.out
//						.println("Hello from the anonymous class's implementation" + Thread.currentThread().getName());
//				try {
//					anotherThread.join(2000);
//					System.out.println("AnotherThread terminated, or timed out, so I'm running again");
//				} catch (InterruptedException e) {
//					System.out.println("I couldn;t wait after all. I was interrupted");
//				}
//
//			}
//
//		});
		myRunnableThread.start();

		System.out.println("Hello again from main thread");

	}

}
