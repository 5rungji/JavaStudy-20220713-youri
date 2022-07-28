package j12_다형성.인터페이스.ATM;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;		
				
		System.out.println("[ATM 접속]");
		
		
		System.out.println("[1. 입금/출금]");
		System.out.println("[2. 계좌이체]");
		System.out.println("[3. 잔액조회]");
		System.out.println("선택 >> ");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			// [1. 입금/출금] 실행
		} else if(select.equals("2")) {
			// [2. 계좌이체]
		} else if(select.equals("3")) {
			// [3. 잔액조회]
		} else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		
		Atm atm = new Atm();
		
		atm.AtmOn(); // ATM 시작
		
		atm.AtmOff();
		//ATM기 종료 

	}

}
