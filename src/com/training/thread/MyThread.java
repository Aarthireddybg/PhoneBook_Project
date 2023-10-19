package com.training.thread;

public class MyThread extends Thread {
	public MyThread(String name) {
	super(name);}
	public void run()
	{
		System.out.println("Thread: "+Thread.currentThread().getName()+ "is running");
	}
}
