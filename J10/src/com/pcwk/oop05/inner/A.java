package com.pcwk.oop05.inner;

public class A {
	class InstanceInner{ } //인스턴스 클래스
	static class StaticInner{} //스태틱 클래스
	
	InstanceInner iTnner = new InstanceInner();//인스턴스 클래스 생성
	
	StaticInner sInner = new StaticInner(); // 스태틱 클래스 생성
	
	void instanceMehthod() {
		InstanceInner iTnner02 = new InstanceInner();//인스턴스 클래스 생성

		StaticInner sInner02 = new StaticInner(); // 스태틱 클래스 생성
	}
	
	static void staticMethod() {
	//인스턴스 멤버에 접근 불가	
	//InstanceInner iTnner02 = new InstanceInner(); //인스턴스 클래스 생성

	StaticInner sInner02 = new StaticInner(); // 스태틱 클래스 생성
	}
	
}
