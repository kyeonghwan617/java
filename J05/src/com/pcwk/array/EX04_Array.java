package com.pcwk.array;

import java.text.DateFormatSymbols;
import java.util.Arrays;

public class EX04_Array {

	public static void main(String[] args) {
		double[] date = new double[5];
		
		System.out.println("배열의 초기값 :"+Arrays.toString(date));
		
		int size = 0;//배열 인덱스
		date[0] = 10.0;//배열요소 0번째에 10.0 대입
		
		size++;
		date[1] = 20.0;//배열요소 0번째에 20.0 대입
		
		size++;
		date[2] = 30.0;//배열요소 0번째에 30.0 대입
		
		for(int i=0;i<size;i++) {
			System.out.println(date[i]);
		}
		System.out.println("===========================");
		System.out.println(Arrays.toString(date));

	}

}
