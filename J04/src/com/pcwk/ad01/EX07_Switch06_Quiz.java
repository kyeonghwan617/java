package com.pcwk.ad01;

import java.util.Scanner;

public class EX07_Switch06_Quiz {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.(1~100)");
		Scanner scanner = new Scanner(System.in);
		//95점 이상이면
		//+
		
		int score = scanner.nextInt();//점수
		//System.out.printlb(score/10);
		char grade = ' ';//학점
		char plus = ' ';
		
		// int/int -> int
		//  91/10 -> 9
		
		switch (score/10) {
		case 10:
		case 9:
			if(score>=95) {
				plus = '+';
			}
			grade = 'A';
			break;
		case 8:
			if(score>=85) {
				plus = '+';
			}
			grade = 'B';
			break;
		case 7:
			if(score>=75) {
				plus = '+';
			}
			grade = 'C';
			break;
		case 6:
			if(score>=65) {
				plus = '+';
			}
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("score :"+ score);
		System.out.println("grade :" + grade+plus);
	}

}
