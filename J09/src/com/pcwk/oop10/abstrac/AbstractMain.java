package com.pcwk.oop10.abstrac;

public class AbstractMain {

	public static void main(String[] args) {
		//추상 클래스는 스슷로 객체를 생성할 수없다.
		//->상속받은 자식을 통해 생성
		//Play play = new Play();

		Play play = new AudioPlay();
		
		play.play(5); //추상 메서드 호출
	    play.disp();  //play일반 메서드
	}

}
