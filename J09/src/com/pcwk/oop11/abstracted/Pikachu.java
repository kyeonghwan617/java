package com.pcwk.oop11.abstracted;

public class Pikachu extends Poketmon {

	public Pikachu() {
		this.name ="피카츄";
	}

	@Override
	void attact() {
		System.out.println("전기 공격");

	}

	@Override
	void sound() {
		System.out.println("피카 피카!");

	}

}
