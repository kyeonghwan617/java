/**
* <pre>
* com.pcwk.ex07.naverapi
* Class Name : NaverSaerchEx01.java
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
package com.pcwk.ex07.naverapi;

import java.io.*;
import java.net.*;

public class NaverSaerchEx01 {

	public static void main(String[] args) {
		String clientId = "kd5XmYWPtCwWrOyyu_ZV"; // 클라이언트 아이디
		String clientSecret = "1TiDTz8rr4"; // 클라이언트 시크릿
		
		if(args.length != 1) {//param이 없으면 종료
			System.out.println("검색어를 입력하세요.");
			System.exit(0);
		}
		
		
		

		String text = args[0];// 검색어
		BufferedReader br = null;

		try {
			text = URLEncoder.encode(text, "UTF-8");
			System.out.println("text : " + text);
			//blog : json
			//String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;
			
			//book : json
			String apiURL = "https://openapi.naver.com/v1/search/book.json?query=" + text;
			
			//book : XML
			//String apiURL = "https://openapi.naver.com/v1/search/book.xml?query="+text;
			
			//news : json
			//String apiURL = "https://openapi.naver.com/v1/search/news.json?query="+text;
			
			
			
			System.out.println("apiURL:" + apiURL);

			URL url = new URL(apiURL);// URL

			// clientId, clientSecret 적용을 위한 HttpURLConnection
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");// GET방식으로 접근
			con.setRequestProperty("X-Naver-Client-Id", clientId);// clientId
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);// clientSecret

			// 200 : 성공
			// 400 : 인증실패
			int responseCode = con.getResponseCode();
			System.out.println("responseCode : " + responseCode);

			if (200 == responseCode) {// 성공
										// byte 스트림을 char 스트림으로 연결 ->BufferedReader생성
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));

				//가지고 온 데이터 출력
				String line = "";
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
			} else {
				System.out.println("클라이언트 id, 클라이언트 secret을 확인하세요.");
				return;
			}

		} catch (IOException e) {
			System.out.println("===============================");
			System.out.println("IOException : " + e.getMessage());
			System.out.println("===============================");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
