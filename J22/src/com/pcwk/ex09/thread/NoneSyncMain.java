package com.pcwk.ex09.thread;

public class NoneSyncMain {

	public static void main(String[] args) {
		Runnable runable01 =new RunnableEx01();
			
		Thread t01 = new Thread(runable01);
		Thread t02 = new Thread(runable01);
	
		t01.start();
		t02.start();
	}

}
//balance : 500
//balance : 500
//balance : 300
//balance : 300
//balance : 0
//balance : -300
