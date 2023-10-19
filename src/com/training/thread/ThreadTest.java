package com.training.thread;

public class ThreadTest {
	public static void main(String[] args)  throws InterruptedException{
		int n=8;
		for(int i=1;i<n;i++)
			try {
				{
					Thread t= new MyThread("Thread:" + i);
					t.start();
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
