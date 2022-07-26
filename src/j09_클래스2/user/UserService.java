package j09_클래스2.user;

import java.util.Scanner;

public class UserService {
	
	private User[] userArray;
	private Scanner scanner;
	
	public UserService(User[] userArray) { 
		//userArray에서 UserService로 전달로 받은 걸 가져옴
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}

	
	//while문으로 질문 메소드를 호출한다
	public boolean showMainMenu() {
		String select = null;

		System.out.println("[사용자 등록 시스템]");
		System.out.println("1. 사용자 등록");
		System.out.println("2. 사용자 리스트 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("메뉴선택 >> ");
		
		select = scanner.nextLine();
		if(select.equals("1")) {
			User user = addUser(); 
			if(user != null) {
				System.out.println(user.toString());
			}
		}else if(select.equals("2")) {
			for(int i = 0; i < userArray.length; i++) {
				System.out.println(userArray[i]);
			}
		}else if(select.endsWith("q")) {
			System.out.println("프로그램 종료중..");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택할 수 없습니다.");
			System.out.println("다시 입력하세요.");
		}
		
		System.out.println();
		return true;
		
	}
	
	
	
	
	// Entity 클래스에 User자료를 담는 과정
	private User addUser() {
		for(int i =0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				continue;
			}
			userArray[i] = inputUser(); // 이게 리스트에 넣는다.
			System.out.println("[" + userArray[i].getUserName() + "] 사용자 등록 완료");
			return userArray[i];
		}
		System.out.println("더 이상 사용자를 등록할 수 없습니다.");
		return null;
	}
	
	
	
	//User를 입력하는 공간
	private User inputUser() {
		String userName = null;
		String password = null;
		String name = null;
		String email = null;		
		
		System.out.println("[사용자 등록]");
		System.out.println("사용자 >> ");
		userName = scanner.nextLine();

		System.out.println("비밀번호 >> ");
		password = scanner.nextLine();

		System.out.println("이름 >> ");
		name = scanner.nextLine();

		System.out.println("이메일 >> ");
		email = scanner.nextLine();
		
		User inputUser = new User(userName, password, name, email);
		return inputUser;
	}
	
	
}
