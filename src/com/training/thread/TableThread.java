package com.training.thread;

public class TableThread implements Runnable {
	int number;
	public TableThread(int number) {
		this.number=number;
	}
	public void run() {
		for (int i=1;i<=10;i++) {
		System.out.println(number+"x"+i+"="+(number*i));
	}
	

}
}
