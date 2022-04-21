package com.pcwk.oop11.abstracted;

public class Squirtle extends Poketmon {

	public Squirtle() {
		this.name = "꼬북이";
	}

	@Override
	void attact() {
		System.out.println("물대포 공격");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");
		
	}

}
