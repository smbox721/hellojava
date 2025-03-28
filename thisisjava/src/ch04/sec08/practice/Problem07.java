package ch04.sec08.practice;

import java.util.Scanner;
import java.util.Random;

public class Problem07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean playgame = false;
		
		while(playgame) {
			System.out.println("==============================");
			System.out.println("    [숫자맞추기 게임 시작]    ");
			System.out.println("==============================");
		
			int answer = (int)(Math.random()*100 + 1); // 랜덤 정답 생성 1 ~ 100사이 
			int number = scanner.nextInt(); // User 값받기 
			//게임 시작
			if (answer > number) {
				System.out.println("더 높게");
			} else if (answer < number) {
				System.out.println("더 낮게");
			} else if(answer == number) {
				System.out.println("맞았습니다.");
			}
			System.out.println("게임을 종료 하시겠습니까? ");
		}
	}	
}
