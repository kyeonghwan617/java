/**
* <pre>
* com.pcwk.util.ex02.stringtokenlze
* Class Name : TokenlzerEx02.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex02.stringtokenlze;

import java.util.StringTokenizer;

/**
 * @author ITSC
 *
 */
public class TokenlzerEx02 {

	/**
	 *  +-* /=()
	 */
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		//Token delim return
		StringTokenizer st = new StringTokenizer(expression, "+-/=()", false);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
