package com.pcwk.ad02;

public class EX05_For3 {

	public static void main(String[] args) {
		//1-10까지 누적
		int sum = 0;	//합계
		
		//초기화: for문 내에서 초기화
		//조건식잉 생략되면 : true
		for(int i=1;true;i++) {
			sum += i;
			if (i == 11)break;
		}
		System.out.println("1~10까지 :"+sum);

	}

}
