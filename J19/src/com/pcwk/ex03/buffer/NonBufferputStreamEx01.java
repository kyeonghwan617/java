/**
* <pre>
* com.pcwk.ex03.buffer
* Class Name : NonBufferputStreamEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/02
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/02 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex03.buffer;

import java.io.*;

public class NonBufferputStreamEx01 {

	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\big_output3.txt";
		System.out.println("filePath : " + filePath);
		long start = System.currentTimeMillis();

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(filePath);
			bis = new BufferedInputStream(fis);
			int data = 0;
			while ((data = bis.read()) != -1) {
				char ch = (char) data;
				System.out.print(ch);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//보조스트림만 닫으면 기반 스트림은 내부적으 close()
			try {
				bis.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		long and = System.currentTimeMillis();

		System.out.println("\n=============================");
		System.out.println("경과시간 : " + (and - start) + " ms");
		System.out.println("종료");
		System.out.println("=============================");
	}

}
