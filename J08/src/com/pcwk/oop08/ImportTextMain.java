package com.pcwk.oop08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTextMain {

	// ctrl+shift+O
	// import문 정리
	public ImportTextMain() { // 생성자
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");// 년-월-일
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");// 시:분:초 오전/오후

		System.out.println("today :" + today);
		System.out.println("오늘 날짜 :" + date.format(today));
		System.out.println("현재 시간 :" + time.format(today));
	}

}
//Loacal PC시간
//today :Thu Jul 14 14:30:06 KST 2022
//오늘 날짜 :2022/07/14
//현재 시간 :02:30:06 오후