package com.pcwk.ad01;

import java.util.Scanner;

public class EX06_Switch05_Quiz {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.(1~100)");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();//점수
		//System.out.printlb(score/10);
		char grade;//학점
		// int/int -> int
		//  91/10 -> 9

		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("score :"+ score);
		System.out.println("grade :" + grade);
	}

}
