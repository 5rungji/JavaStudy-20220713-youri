package j05_입력;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Scan + ctrl + space

		String str = null;
		String str2 = null;
		int num1 = 0;
		
		System.out.print("내용을 입력하세요: ");
		str = scanner.nextLine();
		// 문자열 입력
		// next: 띄워쓰기 줄바꿈 포함
		System.out.println("출력: " + str);
		
		System.out.print("내용을 입력하세요: ");
		str2 = scanner.next(); 
		//nextLine: 띄워쓰기, 줄바꿈 불포함
		System.out.println("출력2: " + str2);

		System.out.print("숫자를 입력하세요: ");
		num1 = scanner.nextInt();
		System.out.println("출력3: " + num1);
		
	}
}
