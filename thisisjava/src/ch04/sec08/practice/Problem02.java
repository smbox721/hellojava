package ch04.sec08.practice;

import java.util.Scanner;

public class Problem02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		
		
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
