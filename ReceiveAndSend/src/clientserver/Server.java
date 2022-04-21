
package clientserver;

import java.io.DataInputStream;

/**
 * 1. 프로젝트 : 서버/클라이언트 통신 프로젝트
 * 2. 파일명 : Client.java
 * 3. 작성자 : 유경환
 * 4. 작성일 : 2022/03/23
 * 5. 설명 : 서버로 데이터를 전송하는 클라이언트

*/

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Server {

	public static void main(String[] args) {
		// Server
		ServerSocket serverSocket = null;
		int port = 7777;

		try {
			System.out.println(getTime() + "서버가 준비 되었습니다.");

			serverSocket = new ServerSocket(port);
			// 서버소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 기다린다.
			Socket socket = serverSocket.accept();
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

			// 소켓의 입력 스트림 생성
			InputStream in = socket.getInputStream();
			byte[] bytes = new byte[100];
			
			int readByteCount = in.read(bytes);
			String readMessage = new String(bytes, 0, readByteCount, "UTF-8");
			//클라이언트(127.0.0.1)로부터 "안녕하세요" 데이터를 받았습니다.
			System.out.println("클라이언트(" + isa.getHostName() + ")로 부터 \"" + readMessage +"\" 데이터를 받았습니다.");

			in.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// --main

	/**
	 * 시스템 현재 시간 return
	 * 
	 * @return
	 */
	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}

}
