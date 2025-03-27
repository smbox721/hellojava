package ch04.sec08.practice;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		while(true) {
			int deposit = 0;
			int withdraw = 0;
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				System.out.print("예금액 > ");
				deposit= scanner.nextInt();
				total = total + deposit;
				//System.out.println(deposit);
				continue;
			}else if(menu == 2) {
				System.out.print("출금액> ");
				withdraw = scanner.nextInt();
				total = total - withdraw;
				continue;
			}else if(menu == 3) {
				System.out.println("잔고> " + total);
			}else if(menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
	}

}
