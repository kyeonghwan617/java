package com.pcwk.oop03.inter;

public class PhoneUser {

	public PhoneUser() {}
	
	void Call(Call c) {
		System.out.println("전화를 겁니다.");
		c.calling();
	}
}
