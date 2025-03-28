package ch04.sec08.practice;

import java.util.Scanner;
import java.util.Random;

public class Problem8 {
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        boolean playAgain = true;

	        System.out.println("=================================");
	        System.out.println("      [숫자맞추기게임 시작]      ");
	        System.out.println("=================================");

	        while (playAgain) { // 외부 반복문: 게임 전체 관리
	            int randomNumber = (int) (Math.random() * 100) + 1; // 랜덤 숫자 생성
	            boolean guessedCorrectly = false;

	            System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");

	            while (!guessedCorrectly) { // 내부 반복문: 사용자 입력 처리
	                System.out.print(">> ");
	                int userGuess = scanner.nextInt();

	                if (userGuess > randomNumber) {
	                    System.out.println("더 낮게");
	                } else if (userGuess < randomNumber) {
	                    System.out.println("더 높게");
	                } else {
	                    System.out.println("맞았습니다.");
	                    guessedCorrectly = true; // 정답을 맞추면 내부 루프 종료
	                }
	            }

	            // 게임 반복 여부 확인
	            System.out.print("게임을 종료하시겠습니까? (y/n): ");
	            char response = scanner.next().charAt(0);
	            playAgain = (response == 'n' || response == 'N'); // 'n'이면 외부 루프 종료
	        }

	        System.out.println("=================================");
	        System.out.println("[숫자맞추기게임 종료]");
	        System.out.println("=================================");	
	}
}
		