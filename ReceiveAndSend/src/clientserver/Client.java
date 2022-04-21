
package clientserver;

/**
 * 1. 프로젝트 : 서버/클라이언트 통신 프로젝트
 * 2. 파일명 : Client.java
 * 3. 작성자 : 유경환
 * 4. 작성일 : 2022/03/23
 * 5. 설명 : 서버로 데이터를 전송하는 클라이언트

*/
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
//	Socket													
//	프로세서간의 통신을 담당하며, Inputstream,OutputStream												

	public static void main(String[] args) {
		// ServerIP, Port
		String serverIp = "127.0.0.1";
		int serverPort = 7777;

		// Socket생성
		try {
			Socket socket = new Socket(serverIp, serverPort);

			// Client로 메시지 전송
			Scanner scanner = new Scanner(System.in);

			System.out.println("서버에서 전송할 메시지를 입력하세요> ");
			String sendMessage = scanner.nextLine();

//			서버(127.0.0.1)로 "안녕하세요" 데이터를 전송했습니다.
			System.out.println("서버(" + socket.getInetAddress() + ")로 \"" + sendMessage + "\" 데이터를 전송했습니다.");

			byte[] bytes = sendMessage.getBytes("UTF-8");

			OutputStream os = socket.getOutputStream();
			os.write(bytes);
			os.flush();
			os.close();
			System.out.println("연결을 종료 되었습니다.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}