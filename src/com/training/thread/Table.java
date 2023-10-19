package com.training.thread;

public class Table {
	public static void main(String[] args) throws InterruptedException {

			Thread t5=new Thread(new TableThread(5));
			Thread t10=new Thread(new TableThread(10));
			t5.start();
			Thread.sleep(1000);
			t10.start();
			
			
		}
	}


