package ch04.sec08.practice;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				int result = 4 * x + 5 *y;
				
				if(result == 60) {
					System.out.print("(" + x + "," + y +  ")");
					System.out.println(" " + result + " ");
				}
			}
		}
	}

}
