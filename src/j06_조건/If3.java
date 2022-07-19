package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("x값: ");
		int x = scanner.nextInt(); 

		System.out.println("y값: ");
		int y = scanner.nextInt(); 
		
		
		String result = null; //몇 사분면인지?
		
		if( x == 0 || y == 0 ) {
			result = "다시 입력해주세요.";
		}else if(x > 0 && y >0) {
			result = "1사분면 입니다.";
		}else if(x < 0 && y > 0) {
			result = "2사분면 입니다.";
		}else if(x < 0) {
			result = "3사분면 입니다.";
		}else {
			result = "4사분면 입니다.";
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과: " + result);

	}

}
