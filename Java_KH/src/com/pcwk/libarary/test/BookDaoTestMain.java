/**
 * 
 */
package com.pcwk.libarary.test;

import com.pcwk.library.domain.Book;
import com.pcwk.libray.dao.BookDao;

/**
 * @author ITSC
 *
 */
public class BookDaoTestMain {

	BookDao dao;
	Book	book01;
	Book	book02;
	Book	book03;
	public BookDaoTestMain() {
		dao = new BookDao();
		book01 = new Book("163032212-9791163032212l-99", "Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석99", "고경희_99", "IT_99", true);
		book02 = new Book("163032212-9791163032212l-999", "Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석999", "고경희_999", "IT_999", true);
		book03 = new Book("163032212-9791163032212l-9999", "Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석9999", "고경희_9999", "IT_9999", true);
	
	}
	
	public void saveFile() {
		int writeCnt = dao.saveFile("booksTmp.scv");
		System.out.println("writeCnt : "+writeCnt);
	}
	
	public void readFile() {
		for(Book b : dao.bookList) {
			System.out.println(b);
		}
	}
	
	
	public static void main(String[] args) {
		BookDaoTestMain bookmain = new BookDaoTestMain();
		bookmain.readFile();//파일에서 읽기
		bookmain.saveFile();//파일에 기록하기

	}

}
