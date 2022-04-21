/**
* <pre>
* com.pcwk.Exception.ex06.throws9
* Class Name : AgeException.java
* Description:
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
package com.pcwk.Exception.ex07.userexception;

//사용자 정의 Exception
public class AgeException extends Exception {

	public AgeException() {
	}

	public AgeException(String Messge) {
		super(Messge);

	}

}
