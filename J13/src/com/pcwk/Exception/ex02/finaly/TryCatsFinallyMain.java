/**
* <pre>
* com.pcwk.Exception.ex02.finaly
* Class Name : TryCatsFinallyMain.java
* Description: Try-catch-finally 실습
* Author: ITSC
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.Exception.ex02.finaly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.pcwk.com.LoggerManager;

/**
 * @author ITSC
 *
 */
public class TryCatsFinallyMain implements LoggerManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			LOG.debug("1");
			// fis = new FileInputStream("a.txt");
			fis = new FileInputStream("C:\\DCOM_20220127\\01_JAVA\\workspace\\J13\\output.log");
			LOG.debug("1-1");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			LOG.debug("2.FileNotFoundException:" + e.getMessage());
		} finally {
			LOG.debug("3.finally 무조건 수행!");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		LOG.debug("프로그램 종료!");
	}

}
