package com.pcwk.oop11.abstracted;


/**
 * Poketmon 추상클래스
 * @author ITSC
 *
 */
public abstract class Poketmon {

	String name;
	
	abstract void attact(); //공격 추상 메서드
	abstract void sound();  //소리 추상 메서드

	
	public String getName() {
		return name;
	}
	
	
}
