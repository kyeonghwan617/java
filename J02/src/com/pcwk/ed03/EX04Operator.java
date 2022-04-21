package com.pcwk.ed03;

public class EX04Operator {

//	비교연산자	
//	양변을 비교하여 같으면 참(true), 다르면 거짓(false)를 반환

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("a<b:"+(a<b));//a<b:true
		System.out.println("a>b:"+(a>b));//a>b:false
		System.out.println(a+b<=c);//true
		System.out.println(a+b>=c);//true
	}

}
