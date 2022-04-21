package laddergame;

import java.util.Arrays;
import java.util.Scanner;

public class LadderMain {

	public static void main(String args[]) {

		Scanner put = new Scanner(System.in);

		// 참가 인원수 등록
		System.out.println("참가 할 인원수를 알려주세요.\n Ex : /3/4/5.... ");
		String[] people;
		int p1 = put.nextInt();
		people = new String[p1];
		
		
		
		
		//벌칙 등록
		System.out.println("벌칙을 등록해 주세요.");
		String[] penalty = new String[people.length];
		for (int i = 0; i < people.length; i++) {
			System.out.print((i+1)+"/"+people.length);
			penalty[i] = put.next();
			
		}
		System.out.println("\n");
		
		
		

		// 이름 등록
		System.out.print("이름을 입력하세요. \n");
		for (int i = 0; i < people.length; i++) {
			System.out.print((i+1)+"/"+people.length);
			people[i] = put.next();
		}
		System.out.println("\n" + Arrays.toString(people) + "\n");
		System.out.println("게임을 시작합니다.\n");
		
		
		
		//사다리타기 시작!
		int random;
		try {
			for (int i = 1; i <= 10; i++) {
				String[] swap = new String[1];
				Thread.sleep(2000);
				random = (int) (Math.random() * (people.length - 1) + 1);
				int a = random;
				System.out.print(a + "-" + (a + 1));
				swap[0] = people[a - 1];
				people[a - 1] = people[a];
				people[a] = swap[0];
				System.out.print("  " + Arrays.toString(people) + "   " + "\n");
			}
		} catch (InterruptedException e) {

		}
		System.out.println("\n결과 : "+Arrays.toString(people));
		System.out.println("벌칙 : "+Arrays.toString(penalty));
		
		
		
		for(int i=0;i<people.length;i++) {
			System.out.print(people[i]+" : "+penalty[i]+"\t\t" );
		}
		
		
		
		
	}
	
	
	
}