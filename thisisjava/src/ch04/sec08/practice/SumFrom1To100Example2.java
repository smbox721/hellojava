package ch04.sec08.practice;

public class SumFrom1To100Example2{
	public static void main(String[] args) {
		int sum = 0; 
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}	
		}
		System.out.println(sum);
		System.out.println("1~" + (i-1) + " 정수중 3의 배수의 총합 : " + sum);
	}
}

