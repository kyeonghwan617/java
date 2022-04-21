package com.pcwk.array;

import java.util.Arrays;

public class EX09_Q01 {

	public static void main(String[] args) {
		//Q1. int[] score = {100,88,100,100,90}에 총합과 평균을 구하시오.

		
		int[] arr = {100,88,100,100,90};
		int sum = 0;
			
		for(int i =0;i<arr.length;i++) {
			sum +=arr[i];	
		}
		System.out.println("sum :"+sum);
		System.out.println("avg :"+sum/(double)arr.length);
	}
}
