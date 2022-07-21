package j06_조건;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int score = 100;
		boolean breakFlag = true;
				
		switch(score / 10) {
			case 10:			
			case 9:
				System.out.println("A");
				if(breakFlag) {
					break; // 제어문: 탈출
				}
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		
	}

}
