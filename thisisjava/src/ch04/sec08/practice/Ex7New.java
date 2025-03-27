package ch04.sec08.practice;

import java.util.Scanner;

public class Ex7New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예금, 출금. 조회, 종료 기능을 제공하는 프로그램 작성
		int balance = 0;
		int request = 0;
		String temp = "";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			
			//메뉴 선택 입력
			temp = sc.nextLine();
			
			if("1".equals(temp)) {
				//잔액 변수에 요청값;
				System.out.print("예금액> ");
				request = Integer.parseInt(sc.nextLine());
				balance += request;
			} else if ("2".equals(temp)) {
				//잔액 변수에서 요청값 차감
				System.out.println("출금액> ");
				request = Integer.parseInt(sc.nextLine());
				if(balance < request) {
					System.out.println("잔액이 부족합니다.");
				}else {
					//잔액이 충분한경우
					balance -= request;
				}
			} else if ("3".equals(temp)) {
				//잔고 출력
				System.out.println("잔액> " + balance);
			} else if ("4".equals(temp)) {
				//종료
				System.out.println("프로그램 종료");
				break;
			}
			//예금
			
		}
	}

}
