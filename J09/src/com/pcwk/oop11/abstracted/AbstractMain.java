package com.pcwk.oop11.abstracted;

public class AbstractMain {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu();
		System.out.println("이 포켓몬은 : "+pikachu.getName());
		pikachu.sound();
		pikachu.attact();

		System.out.println("============================");
		
		Squirtle squirtle = new Squirtle();
		System.out.println("이 포켓몬든 : "+squirtle.getName());
		squirtle.sound();
		squirtle.attact();
	}

}
