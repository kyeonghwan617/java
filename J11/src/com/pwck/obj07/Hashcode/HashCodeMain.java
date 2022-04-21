package com.pwck.obj07.Hashcode;

public class HashCodeMain {

	public static void main(String[] args) {
		String str01 = new String("KOTEA IT");
		String str02 = new String("KOTEA IT");

		//equals 오버라이딩해서 데이터로 비교
		System.out.println(str01.equals(str02));
		System.out.println(str01.hashCode());//1430644159
		System.out.println(str02.hashCode());//1430644159
		
		//객체의 주소값으로 해시코드를 생성하므로 객체마다 모두 다르다.
		System.out.println(System.identityHashCode(str01));//604107971
		System.out.println(System.identityHashCode(str02));//123961122
		

	}

}
