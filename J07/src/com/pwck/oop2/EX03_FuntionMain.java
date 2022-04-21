package com.pwck.oop2;

public class EX03_FuntionMain {

	public static void main(String[] args) {
		int first = 11;
		int second = 5;
		
		int sum = add(first, second);
		System.out.println(first + "+" +second + "=" +sum);
	
		int subtrack = subtrack(first, second);
		System.out.println(first + "-" +second + "=" +subtrack);
	
		int multuply = multuply(first, second);
		System.out.println(first + "*" +second + "=" + multuply);
		
		double devi = divide(first, second);
		System.out.println(first + "/" +second + "=" +devi);

	}
	
	
	/**
	 * 나누기
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	public static double divide(int num1, int num2) {
		return num1 / (1.0*num2);
	}
	/**
	 * 곱하기
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	public static int multuply(int num1,int num2) {
		return num1*num2;	
	}
	
	/**
	 * 빼기
	 * @param num1
	 * @param num2
	 * @return num1 - num2
	 */
	public static int subtrack(int num1, int num2) {
		return num1 - num2;
	}
	
	
	/**
	 * 더하기
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	public static int add(int num1, int num2) {
		int result = 0;
		
		result = num1 + num2;
		
		return result;
	}
	
}

//11+5=16
//11-5=6
//11*5=55
//11/5=2.2

