/**
 * ��Ű�� : com.pcwk.var01
 * ���� :  VariavlelmplicitConversion.java
 * �ۼ��� : ITSC
 */
package com.pcwk.var01;

/**
 * @author ITSC
 *
 */
public class VariavlelmplicitConversion {

//	������ ����ȯ	
//	���� ������ ū ����, �� ������ ������ �� ������ ���� ���� �Ǵ� ���

	public static void main(String[] args) {
		byte bNum = 11;
		int iNum = bNum;// byte�� ���� int������ �ڵ� ��ȯ��
		System.out.println("bNum:"+bNum);
		System.out.println("iNum:"+iNum);
		
		//�� ������ ������ �� ������ ���� ����
		int iNum02 = 14;
		float fNum = iNum02;
	
		System.out.println("iNum02:"+iNum02);//14
		System.out.println("bNum02:"+fNum);//14.0
		
		double dNum;
	   // 		14.0+ 11 - > 14.0 + 11.0
		dNum = fNum + iNum;
		System.out.println("dNum:"+dNum);//25.0
	}
}
