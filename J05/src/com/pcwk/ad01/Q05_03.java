package com.pcwk.ad01;

public class Q05_03 {

	public static void main(String[] args) {
		
//		Q3. 구구단의 짝수단만 출력하도록 프로그램을 작성하세요.
//		for(){//2-9
//			for(){//1-9
//			}
//		}
		
		
		int num;
		
		for(int i = 2;i<=9;i++) {
			if(i%2!=0) { //홀수 걸러내기
				continue;
			}
			System.out.println();
			for(int j =1;j<=9;j++) {

				num = i * j;
				System.out.print(i +"*"+ j +"="+ num +"  ");
			}

		}

	}

}
