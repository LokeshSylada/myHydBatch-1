package com.technoelevate.multithreading;

public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Another thread woke me up");
			return;
		}
		System.out.println("Three seconds have passed and I'm awake" + Thread.currentThread().getName());
	}

}
