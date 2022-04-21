package com.pcwk.arrray01;

import java.util.Arrays;

public class Q05_LotSort {

	public static void main(String[] args) {
//		Q3. 로또번호 추출	
//		(1~45)숫자중 중복되지 않게 숫자 6개를 추출 하세요.

		int[] ball = new int[45];
		
		//1. 숫자 1 ~ 45를 할당
		//2. shuffle 6개를 추출
		
		for(int i =0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		System.out.println("번호 : "+Arrays.toString(ball));

	
		//2.
		for(int j=0;j<=5;j++) {
			int n = (int)(Math.random()*45);
			//System.out.println(n);

			int tmp = ball[j];
			ball[j] = ball[n];
			ball[n] = tmp;
		
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+",");
		}
		System.out.println();
		//--------------------------------------------
		//sort
		//--------------------------------------------
		int []sortBall= new int[6];
		System.arraycopy(ball, 0, sortBall, 0, sortBall.length);
		System.out.println("before softBall:"+Arrays.toString(sortBall));
	
	
		//2.sort
		for(int i= 0;i<sortBall.length-1;i++) {
			for(int j =0;j<sortBall.length-1-i;j++) {
				
				if(sortBall[j]>sortBall[j+1]) {
					int tmp = sortBall[j];
					sortBall[j] = sortBall[j+1];
					sortBall[j+1] = tmp;
				}
			}
		}
		
		System.out.println("Sort Lotto =>"+Arrays.toString(sortBall));
	}
}



