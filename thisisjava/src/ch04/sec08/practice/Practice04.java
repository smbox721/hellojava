package ch04.sec08.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int maxNumber = 0;
		
		for(int i = 1; i <= 5; i++) { 
			System.out.print("숫자: ");
			int n = scanner.nextInt();
			
			if(n > maxNumber) {
				maxNumber = n;
			}
		}
		System.out.println("가장 큰 수는 " + maxNumber);
	}
}
