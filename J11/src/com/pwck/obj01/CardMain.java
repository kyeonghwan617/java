package com.pwck.obj01;

public class CardMain {

	public static void main(String[] args) {
		Card c01 = new Card();
		Card c02 = new Card();
		//c01 == c02,toString()
		//컴파일러가 c02.toString()을 호출 한다.
		System.out.println(c01);//com.pwck.obj01.Card@26f0a63f
		System.out.println(c02.toString());//com.pwck.obj01.Card@26f0a63f
	}

}
