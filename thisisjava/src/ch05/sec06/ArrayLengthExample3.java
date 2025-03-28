package ch05.sec06;
import java.util.Scanner;

public class ArrayLengthExample3 {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 대입
		Scanner scanner = new Scanner(System.in);				
		System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요");
		int[] scores = new int[3];
	
		for (int i = 0; i < scores.length; i++) {
			scores[i] =  scanner.nextInt();
		}
		
//		System.out.println(n);
//		int[] scores = new int[n];
		
		
		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { //렝스 돌릴때 같음 부호 넣으면안돼안돼
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}

