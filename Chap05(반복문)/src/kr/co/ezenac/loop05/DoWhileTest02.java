package kr.co.ezenac.loop05;

import java.util.Scanner;

/*
 * 	메시지를 입력하세요.
 *  프로그램을 종료하려면, q를 입력하세요.
 *  >이젠
 *  입력받은 메시지 : 이젠
 *  >신논현역
 *  입력받은 메시지 : 신논현역
 *  >q
 *  입력받은 메시지 : q
 *  프로그램을 종료합니다.
 *  
 *  
 *  
 */
public class DoWhileTest02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면, q를 입력하세요.");
		
		String str = null;
		
		do {
			System.out.print(">");
			str = scanner.nextLine();
			System.out.println("입력받은 메시지 : " + str);
			
		} while(!str.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}

}












