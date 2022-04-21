/**
* <pre>
* com.pcwk.util.ex03.singleton
* Class Name : Singleton.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex03.singleton;

/**
 * @author ITSC
 *
 */
public class Singleton {

	private static Singleton singleton; //
	
	//생성자는 private
	private Singleton() {}
	
	//객체 생성용 static 메서드
	public static Singleton getSingleton( ) {
		
		if(null == singleton) {
			singleton = new Singleton();
		}
		
		
		return singleton;
	}
	
	
}
