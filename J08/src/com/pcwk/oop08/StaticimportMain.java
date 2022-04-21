package com.pcwk.oop08;

import static com.pcwk.oop08.Card.HEIGHT;
import static com.pcwk.oop08.Card.WIGHT;

//import java.lang.*
//jvm이 넣어줌!
import static java.lang.System.out;
import static java.lang.Math.*;
public class StaticimportMain {

	public static void main(String[] args) {
		System.out.println("Card.WIGHT :"+Card.WIGHT);
		System.out.println("Card.WIGHT :"+Card.HEIGHT);
		
		//System.out.println -> out.println
		System.out.println();
		
		//Math.random() -> random()
		out.println(random());
	}

}
