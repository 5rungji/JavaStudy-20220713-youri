package j12_다형성.인터페이스.ATM;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AtmMain {

	public static void main(String[] args) {
		
		User user1 = new User("일유리");
		User user2 = new User("이유리");
		User user3 = new User("삼유리");
		
		ArrayList<User> userList = new ArrayList<User>();
		User[] users = {user1, user2, user3};
		
		userList.addAll(Arrays.asList(users));
		System.out.println(userList);
		
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < userList.size(); i++) {
			String select = null;
			AtmService selectAtm = null;

			//ATM 종류 고르기
			System.out.println("[은행 종류]");
			System.out.println("1. A은행");
			System.out.println("2. B은행");
			System.out.println("선택 >> ");
			
			select = scanner.nextLine();
			
			if(select.equals("1")) {
				selectAtm = new Abank_Atm();
			}else if(select.equals("2")) {
				selectAtm = new Bbank_Atm();
			}else {
				System.out.println("종류를 잘 못 선택하셨습니다.");
			}

			Atm atm = new Atm(selectAtm, users[i]);		

			//ATM 버튼 고르기
			System.out.println("[버튼 종류]");
			System.out.println("1.조회 2.입금 3.송금 4.이체");
			System.out.println("선택 >> ");
			
			select = scanner.nextLine();
			
			if(select.equals("1")) {
				atm.userCheck();
			}else if(select.equals("2")) {
				atm.userDeposit();
			}else if(select.equals("3")) {
				atm.userTransfer();
			}else if(select.equals("4")) {
				atm.userWithdraw();
			}else {
				System.out.println("종류를 잘 못 선택하셨습니다.");
			}		
		}		
	}
}
