package com.pcwk.libray.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.com.DTO;
import com.pcwk.com.LoggerManager;
import com.pcwk.com.WorkDiv;
import com.pcwk.library.domain.Book;

public class BookDao implements WorkDiv<Book>, LoggerManager {
	// 저장 파일에서 읽어 들인 Data : CRUD,마지막 파일에 기록
	public static List<Book> bookList = new ArrayList<>();
	// 저장 파일 경로
	public static final String SAVE_FILE_PATH = "C:\\DCOM_20220127\\01_JAVA\\workspace\\Java_KH\\src\\com\\pcwk\\data\\books.csv";

	public BookDao() {
		int readStatus = readFile(SAVE_FILE_PATH);
		if (0 == readStatus) {
			LOG.debug("파일 읽기 실패");
		} else {
			LOG.debug("파일 읽기 성공");
		}

	}

	/**
	 * ArrayList에 있는 내용을 SAVE_FILE_PATH에 기록
	 * @param filePath
	 * @return 저장 건수 return
	 */
	public int saveFile(String filePath) {
		int witheCnt = 0;
		//FileWriter fw = new FileWriter(filePath);
		
		//try-with-resource		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
			
			//arrayList -> file기록
			for(Book book : bookList) {
				//1163032212-9791163032212,Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석,고경희,IT,1
				String del = ",";
				
				//대여가능 여부
				int available = book.isAvailable()?1:0;
				String outData = book.getIsbn()+del+
								 book.getTitle()+del+
								 book.getAuthor()+del+
								 book.getGenre()+del+
								 available+"\n";
				bw.write(outData);
				
				witheCnt++;
								 
			}
			
		}catch(IOException e) {
		  LOG.debug("========================");
		  LOG.debug("=IOException="+e.getMessage());
		  LOG.debug("========================");
		}
		
		return witheCnt;
		
	}
	
	/**
	 * books.csv를 읽어서 bookList할당
	 * 
	 * @param filePath
	 * @return 0(실패)/1(성공)
	 */
	public int readFile(String filePath) {
		int flag = 0;
		// try-with-resource
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = "";

			// 8994492046-9788994492049,Java의 정석 기초편,남궁성,IT,1 => Book
			while ((line = br.readLine()) != null) {

				String[] inArray = line.split(",");

				// public Book(String isbn, String title, String author, String genre, boolean
				// available) {
				// 대여가능 여부
				// 1 -> true
				// 0 -> false
				boolean available = (inArray[4].equals("1") ? true : false);

				Book book = new Book(inArray[0], inArray[1], inArray[2], inArray[3], available);

				bookList.add(book);
			}

		} catch (IOException e) {
			LOG.debug("=======================");
			LOG.debug("=IOException=" + e.getMessage());
			LOG.debug("=======================");
		}

		return flag;
	}

	@Override
	public List<Book> deRetrieve(Book dto) {
		return null;
	}

	@Override
	public int doSave(Book dto) {
		return 0;
	}

	@Override
	public int doDelete(Book dto) {
		return 0;
	}

	@Override
	public DTO doSelectOne(Book dto) {
		return null;
	}

	@Override
	public int doUpdate(Book dto) {
		return 0;
	}

}
