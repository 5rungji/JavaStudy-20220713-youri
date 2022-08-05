package j12_다형성.인터페이스.ATM;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AtmMain {
	Scanner scanner = new Scanner(System.in);
	
	
	public boolean Button(String select, AtmService selectAtm, User user){		
		select = scanner.nextLine();
		Atm atm = new Atm(selectAtm, user);		
		
		if(select.equals("1")) {
			atm.userCheck();
		}else if(select.equals("2")) {
			atm.userDeposit();
		}else if(select.equals("3")) {
			atm.userTransfer();
		}else if(select.equals("4")) {
			atm.userWithdraw();
		}else if(select.equals("q")) {
			return false;
		}else {
			System.out.println("종류를 잘 못 선택하셨습니다.");
		}
		return true;
	}

	
	public static void main(String[] args) {
		AtmMain atmMain = new AtmMain();
		Scanner scanner = atmMain.scanner;

		String select = null;
		AtmService selectAtm = null;

		while(true) {
			//ATM 종류 고르기
			System.out.println("[은행 종류]");
			System.out.println("1. A은행");
			System.out.println("2. B은행");
			System.out.println("q. 프로그램 종료");
			System.out.println("선택 >> ");
			
			select = scanner.nextLine();
		
			if(select.equals("1")) {
				selectAtm = new Abank_Atm();
			}else if(select.equals("2")) {
				selectAtm = new Bbank_Atm();
			}else if(select.equals("q")) {
				System.out.println("프로그램을 종료합니다..");
				return;
			}else {
				System.out.println("지원하지 않는 은행입니다.");
				break;
			}

			//사용자 확인
			String name = null;
			int bankCode = 0;
			
			System.out.println("사용자 정보를 확인합니다.");
			
			System.out.println("사용자: ");
			name = scanner.nextLine();
			System.out.println("계좌번호: ");
			bankCode = scanner.nextInt();
			scanner.nextLine();
			
			User user = new User(name, bankCode);
			
			//ATM 버튼 고르기			
			boolean flag = true;
			while(flag) {
				System.out.println("[버튼 종류]");
				System.out.println("1.조회 2.입금 3.송금 4.이체");
				System.out.println("q. 뒤로 가기");
				System.out.println("선택 >> ");
					
				flag = atmMain.Button(select, selectAtm, user);
			}


		}
		
	}
}
