package ch04.sec08.practice;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		int total = 0;
		
		if(num % 2 == 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					total += i;
				}
			}
		}else {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 1) {
					total += i;
				}
			}
		}
		System.out.println("결과값: " + total);
	}
}
