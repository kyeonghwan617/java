package com.pcwk.ad01;
import java.util.Scanner;
public class EX03_Swich02 {

	public static void main(String[] args) {
		
		//console입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력>");
		
		int month = 1;
		month = scanner.nextInt();
		int day = ' ';

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 31;
			break;
		}
		System.out.println("month : " + month);
		System.out.println("day : " + day);
	}

}
