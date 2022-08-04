package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {

		String username = null;
		String password = null;
		String name = null;
		String email = null;		
		
		//입력
		System.out.println("아이디: ");
		username = scanner.nextLine();
		System.out.println("비밀번호: ");
		password = scanner.nextLine();
		System.out.println("이름: ");
		name = scanner.nextLine();
		System.out.println("이메일: ");
		email = scanner.nextLine();
		
		//User 객체 생성
		//User user = new User(username, password, name, email);	
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();

		//UserList에 add하기
		userList.add(user);
	}
	
	public void printUserList(){
		//userList 내용 출력 (toStringX)
		/*
		 * 아이디		> aaa
		 * 비밀번호	> 1234
		 * 이름		> 김준일
		 * 이메일		> aaa@naver.com
		 * 
		 * 아이디		> bbb
		 * 비밀번호	> 5678
		 * 이름 		> 김준이
		 * 이메일		> bbb@naver.com
		 */
		
//		for(int i = 0; i < userList.size(); i++) {
//			System.out.println("아이디: \t" + userList.get(i).getUsername());
//			System.out.println("비밀번호: \t" + userList.get(i).getPassword());
//			System.out.println("이름: \t" + userList.get(i).getName());
//			System.out.println("아메일: \t" + userList.get(i).getEmail());
//			System.out.println();
//		}
		
		for(User user : userList) {
			System.out.println("아이디: \t" + user.getUsername());
			System.out.println("비밀번호: \t" + user.getPassword());
			System.out.println("이름: \t" + user.getName());
			System.out.println("아메일: \t" + user.getEmail());
		}		
	}
	
	public void removeUser() {
		String deletUsername = null;
		String deletPassword = null;
		
		// 아이디 입력
		System.out.println("아이디: ");
		deletUsername = scanner.nextLine();
		
		// 해당 아이디 계정만 삭제
		for(User user : userList) {
			if(user.getUsername().equals(deletUsername)) {
				// 비밀번호 확인
				System.out.println("비밀번호: ");
				deletPassword = scanner.nextLine();

				if(user.getPassword().equals(deletPassword)) {
					System.out.println(user.getName() + "의 정보가 삭제됩니다..");
					userList.remove(user);
					return;
					// 1번부터 차례로 검사하는데 remove를 사용하면 
					// 직전의 순서가 꼬이기 떄문에 에러가 납니다.
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return; 
					//for문 밖으로 탈출하기 위해서.
					//break일 경우 사용자를 찾을수없습니다가 뜬다
				}
			}
			System.out.println("사용자를 찾을 수 없습니다.");
		}		
	}
	
	
	public static void main(String[] args) {		
		UserArrayList userArrayList = new UserArrayList();

		while(true) {
			String select = null;
			
			System.out.println("[사용자 관리 프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
	
			System.out.println("메뉴 선택 > ");
	
			select = userArrayList.getScanner().nextLine();	
			
			if(select.equals("1")) {
				userArrayList.addUser(); //사용자 추가
			}else if(select.equals("2")) {
				userArrayList.printUserList(); //사용자 출력
			}else if(select.equals("3")) {
				userArrayList.removeUser(); //사용자 삭제
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당 번호는 사용할 수 없는 기능입니다.");
			}		
			System.out.println();
		}		

	}

}
