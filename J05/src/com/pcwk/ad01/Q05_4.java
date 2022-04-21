package com.pcwk.ad01;

public class Q05_4 {

	public static void main(String[] args) {
		
//		Q04. 구구단 중 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
//		2*1=2
//		2*2=4
//		
//		3*1=1
//		3*2=6
//		3*3=9		

		
		for(int i = 2;i<=9;i++) {

			System.out.println();
			for(int j =1;j<=9;j++) {
				if(i<j) {
					break;//반복문을 벗어 난다.
				}
				System.out.print(i +"*"+ j +"="+ (i*j) +"  ");
//				효율이 좋지 않다
//				if(j<=i) {
//					System.out.print(i +"*"+ j +"="+ (i*j) +"  ");
//				}
				
			}

		}

	}

}
