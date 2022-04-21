/**
* <pre>
* com.pcwk.Exception.ex08.userexception
* Class Name : IdFormatExceptionMain.java
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
package com.pcwk.Exception.ex08.userexception;

import com.pcwk.com.LoggerManager;

/**
 * @author ITSC
 *
 */
public class IdFormatExceptionMain implements LoggerManager {
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IdFormatException {
		// id == null 예외발생
		if (null == userID) {
			throw new IdFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) { // (!8=id<=20)
			throw new IdFormatException("아이디는 8자 이상 20자 이하로 사용하세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IdFormatExceptionMain idformat = new IdFormatExceptionMain();
		String id = "a123456";

		try {
			idformat.setUserID(id);
		} catch (IdFormatException e) {
			LOG.debug("IDformatException:" + e.getMessage());
		}

		LOG.debug("프로그램 종료");
	}
}