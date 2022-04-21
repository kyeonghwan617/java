package com.pcwk.ad02;

public class EX01_While01 {

	public static void main(String[] args) {
		int num; //숫자
		int sum; //합계
		
		//초기화
		num = 1;
		sum = 0;
		
		while(num<=10) {
			sum += num; //sum = sum + num
			System.out.println(num);
			++num;		//num = num + 1

		} //while
		System.out.println("sum :"+sum);
	}

}