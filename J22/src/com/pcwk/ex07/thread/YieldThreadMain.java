package com.pcwk.ex07.thread;

public class YieldThreadMain {

	public static void main(String[] args) {
		
		YieldTread yieldTread = new YieldTread();
		NormThread normthread = new NormThread();
		
		Thread t01= new Thread(yieldTread);
		Thread t02= new Thread(normthread);
		
		t01.start();
		t02.start();
	}

}

//☆★★★☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆★★★★★★★★★★★★★☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆...