package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		/*
		 * 반복횟수 입력: 입력숫자만큼 숫자 순차출력
		 */
		
		int i = 0;
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반복횟수: ");
		n = scanner.nextInt();
		
		while(i < n) {
			System.out.println("i =" + (i+1));
			i++;
		}
		
		i = 0 ;
		
		while(i < n) {
			System.out.println("i =" + (n - i));
			i++;
		}


	}

}
