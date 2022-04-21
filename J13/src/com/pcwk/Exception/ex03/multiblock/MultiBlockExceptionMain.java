/**
* <pre>
* com.pcwk.Exception.ex03.Multiblock
* Class Name : MultiBlockExceptionMain.java
* Description: JDK 1.7부터 여러 
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
package com.pcwk.Exception.ex03.multiblock;

/**
 * @author ITSC

 *
 */
//JDK 1.7부터 여러 catch블럭을 | 기호를 이용해서, 하나의 catch블럭을 합칠 수 있다.
import com.pcwk.com.LoggerManager;

public class MultiBlockExceptionMain implements LoggerManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.debug("1");
		LOG.debug("2");

		int[] intArry = { 1, 2, 0, 3 };
		try {
			LOG.debug("3");
			LOG.debug(1 / 0);// 예외 발생
			LOG.debug("4");// 수행되지 않음

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// 예상되는 예외
			LOG.debug("5 ArithmeticException");
//	}catch(ArithmeticException e) {//예상되는 예외
//		LOG.debug("5-1 ArrayIndexOutOfBoundsException");	
		} catch (Exception e) {// 그외 모든 예외
			LOG.debug("6 Exception");
		} finally {
			LOG.debug("7 finally");
		}

		LOG.debug("8.종료");
	}
}
