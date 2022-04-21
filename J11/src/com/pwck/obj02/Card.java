package com.pwck.obj02;

public class Card {
	String kind;
	int number;
	
	public Card() {
		this("SPADE",10);
	}
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

}
