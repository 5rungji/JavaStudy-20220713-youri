package j09_클래스2.user;

import java.util.Scanner;

import j09_클래스2.Student;

public class UserService {
	
	private User[] userArray;
	private Scanner scanner;
	
	public UserService(User[] userArray) { 
		//userArray에서 UserService로 전달로 받은 걸 가져옴
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}

	
	//메뉴 선택 오류
	private void printSelectErrorMessage() {
		System.out.println("해당 메뉴는 선택할 수 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	
	//메뉴선택
	private String inputSelect() {
		System.out.println("메뉴선택 >> ");		
		return scanner.nextLine();
	}
	
	
	//while문으로 질문 메소드를 호출한다
	public boolean showMainMenu() {
		String select = null;

		System.out.println("[사용자 등록 시스템]");
		System.out.println("1. 사용자 등록");
		System.out.println("2. 사용자 조회");
		System.out.println("3. 프로그램 종료");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			User user = addUser(); 
			if(user != null) {
				System.out.println(user.toString());
			}
		}else if(select.equals("2")) {
			while(showUserService()) {}
		}else if(select.endsWith("q")) {
			System.out.println("프로그램 종료중..");
			return false;
		}else {
			printSelectErrorMessage();
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
	
	
	// 메뉴 2번 문항. 사용자 조회
	public boolean showUserService() {
		String select = null;

		System.out.println("[사용자 조회]");
		System.out.println("1. 사용자 전체 조회");
		System.out.println("2. 이름으로 검색");
		System.out.println("b. 뒤로가기");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			showUserList();
		}else if(select.equals("2")) {
			// 사용자 아이디로 조회
			showSearchUser();
		}else if(select.endsWith("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		}else {
			printSelectErrorMessage();
		}		
		System.out.println();
		return true;		
	}
	

	// 메뉴 2번 문항 > 사용자 조회 > 1번 사용자 전체 조회
	private void showUserList() {
		System.out.println("[사용자 전체 조회]");
		System.out.println("이름\t\t비밀번호\t\t이름\t\t이메일");
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				System.out.println(userArray[i].getUserName() + "\t\t"
						+ userArray[i].getPassword() + "\t\t"
						+ userArray[i].getName() + "\t\t"
						+ userArray[i].getEmail() + "\t\t"
						);
			}
		}
		System.out.println();
	}
	
	
	// 메뉴 2번 문항 > 사용자 조회 > 2번 사용자 아이디로 조회	
	private void showSearchUser() {
		String searchName = null; //searchUserName = 찾는사용자이름
		String serachPassword = null; //serachPassword = 비밀번호확인
		System.out.println("[사용자 아이디 및 패스워드로 검색]");

		System.out.println(" 아이디 >> ");
		searchName = scanner.nextLine(); //searchName=찾는학생이름
		
		System.out.println(" 패스워드 >> ");
		serachPassword = scanner.nextLine(); //searchName=찾는학생이름
		
		User searchUser = searchUserByUserName(searchName);
		
		if(searchUser != null) {
			if(serachPassword.equals(searchUser.getPassword())) {
				System.out.println(searchUser.toString());
			}else {
				System.out.println("비밀번호 오류!");
			}
		}
		
	}
	
	private User searchUserByUserName(String searchName) {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				String username = userArray[i].getUserName();
				if(searchName.equals(username)) {
					return userArray[i];
				}
			}
		}
		System.out.println("해당 이름의 사용자는 존재하지 않습니다.");
		return null;
	}
	
	
}
