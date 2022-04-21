/**
* <pre>
* com.pcwk.ex05.buffer
* Class Name : BufferedReaderEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/03
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/03 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex05.buffer;

import java.io.*;

import com.pcwk.com.LoggerManager;
public class BufferedReaderEx01 implements LoggerManager{


	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex04\\inputstreamreader\\InputStreamReaderEx01.java";
		try (FileReader fr= new FileReader(filePath);
			 BufferedReader br = new BufferedReader(fr);
				){
			String line = "";//라인단위 read
			int i =1;
			while ((line = br.readLine()) != null) {
				System.out.println(i+"\t"+line);
				i++;
			}
			
			
		}catch(FileNotFoundException e) {
			LOG.debug("FileNotFoundException======================");
			LOG.debug(e.getMessage());
			LOG.debug("======================");
		}catch(IOException e) {
			LOG.debug("======================");
			LOG.debug(e.getMessage());
			LOG.debug("======================");
			
			
		}
		System.out.println("프로그램 종료!");
	}

}
