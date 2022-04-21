package com.pcwk.Exception.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.pcwk.com.LoggerManager;

//LoggerManager LOG위해 implements
public class LoggerManger implements LoggerManager {

	public static void main(String[] args) {
		LOG.debug("===================");
		// checked 예외
		// 예외 처리를 하지 않으면 Compile 오류

		try {
			// C:\DCOM_20220127\01_JAVA\workspace\J13\src\com\pcwk\Exception\ex01\LoggerManger.java
			FileInputStream fis = new FileInputStream(
					"C:\\DCOM_20220127\\01_JAVA\\workspace\\J13\\src\\com\\pcwk\\Exception\\ex01\\LoggerManger.java");
		} catch (FileNotFoundException e) {
			// printsStackTreace() : 예외 당시 호출스택(Call Stack)에 있었던 메서드의
			// 정보와 예외 메시지를 화면에 출력한다.

			// getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
			LOG.debug("getMessage:" + e.getMessage());
			// e.printStackTrace();
		}
	}

}
