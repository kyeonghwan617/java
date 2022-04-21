/**
* <pre>
* com.pcwk.util.ex03.singleton
* Class Name : SingletonMain.java
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
public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//- The constructor Singleton() is not visible
		//Singleton s01 = new Singleton();

		Singleton s01 = Singleton.getSingleton();
		Singleton s02 = Singleton.getSingleton();
		
		
		System.out.println("s01 :"+s01);
		System.out.println("s02 :"+s02);
	}

}
