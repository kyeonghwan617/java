package com.pcwk.oop02;

public class StaticTextClass {
	int iv;			//인스턴스 변수
	static int cv;  // 클래스 변수

	void instanceMethod( ) {
		System.out.println(iv); //인스턴스 변수 사용 가능
		System.out.println(cv); //클래스 변수를 사용가능
	}

	static void staticMethod( ) {
		//Cannot make a static reference to the non-static field iv(클래스변수에 인스턴스변수를 사용할 수 없음)
		//System.out.println(iv); //인스턴스 변수 사용불가
		System.out.println(cv); //클래스 변수 사용 가능
	}
}
