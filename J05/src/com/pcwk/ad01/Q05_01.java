package com.pcwk.ad01;

import java.util.Scanner;

public class Q05_01 {

	public static void main(String[] args) {
//		Q1. 두수를 입력받아 사칙 연산을 수행하는 프로그램을 작성 하세요.
//		(입력은 int로 받으세요.)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("num1을 입력 하세요 >>");
		int num1 = scanner.nextInt();
		
		System.out.println("num2을 입력 하세요 >>");
		int num2 = scanner.nextInt();
		
		System.out.println("operator을 입력 하세요 >>");
		//nextLine() : 위쪽 Enter에 영향을 받음.
		//->next()로 변경
		String operator = scanner.next();
		
		double result = 0;//연산결과
		
		
		if("+".equals(operator)) {
			result = num1 + num2;	
		} else if("-".equals(operator)) {
			result = num1 - num2;
		} else if("*".equals(operator)) {
			result = num1 * num2;
		} else if("/".equals(operator)) {
			result = num1 / (double)num2;
		} else {
			System.out.println("연산자를 확인 하세요.");
			return;
		}
			
			
		System.out.println(num1 +(""+operator)+num2+"="+result);
	}

}






