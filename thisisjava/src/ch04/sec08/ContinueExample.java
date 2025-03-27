package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 2; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
	}
}
