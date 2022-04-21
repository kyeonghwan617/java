package com.pcwk.oop03;

public class StaticPractice {

	public static int num = 11;
	
	static { //클래스 초기화 블럭
		//static 번수의 복잡한 초기화
		System.out.println("클래스 초기화 블럭");
	}

	
	public StaticPractice() {
		super();
		System.out.println("default생성자");
	}


	public static void say() { //메서드
		System.out.println("인스턴스를 생성하지 않고도 사용 가능.");
	}
	
	
}
