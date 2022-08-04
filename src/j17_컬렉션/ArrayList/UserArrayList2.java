package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserArrayList2 {
	Scanner scanner = new Scanner(System.in);
	ArrayList<User> userList = new ArrayList<User>();
	
	
	public void addUser() {
		//사용자 추가
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디: ");
		username = scanner.nextLine();
		System.out.println("비밀번호: ");
		password = scanner.nextLine();
		System.out.println("이름: ");
		name = scanner.nextLine();
		System.out.println("이메일: ");
		email = scanner.nextLine();
	
		User user = new User(username, password, name, email);
		
		userList.add(user);
	}
	
	public void printUserList() {
		//사용자 리스트 출력
		for(User user : userList) {
			System.out.println("아이디: \t" + user.getUsername());
			System.out.println("비밀번호: \t" + user.getPassword());
			System.out.println("이름: \t" + user.getName());
			System.out.println("아메일: \t" + user.getEmail());
			System.out.println();
		}
		
	}
	
	public void deleteUser() {
		//사용자 삭제
		String deleteUsername = null;
		String deletePassword = null;
		
		System.out.println("아이디: ");
		deleteUsername = scanner.nextLine();
		
		for(User user : userList) {
			if(user.getUsername().equals(deleteUsername)) {
				System.out.println("비밀번호: ");
				deletePassword = scanner.nextLine();
				if(user.getPassword().equals(deletePassword)) {
					System.out.println(user.getUsername() + "가 삭제됩니다..");
					userList.remove(user);
					return;
				}else {
					System.out.println("비밀번호 에러");
				}
			}
			System.out.println("사용자를 찾을 수 없습니다.");
		}		
	}
	
	
	
	public static void main(String[] args) {
		UserArrayList2 userList = new UserArrayList2();
		Scanner scanner = userList.scanner;
		
		String select = null;

		while(true) {
			
		System.out.println("[사용자 관리 프로그램]");
		System.out.println("1. 사용자 추가");
		System.out.println("2. 사용자 리스트 출력");
		System.out.println("3. 사용자 삭제");
		System.out.println("q. 프로그램 종료");
		System.out.println("번호 선택 >> ");
		
		select = scanner.nextLine();
		
			if(select.equals("1")) {
				userList.addUser();
				System.out.println();
			}else if(select.equals("2")){
				userList.printUserList();
				System.out.println();
			}else if(select.equals("3")){
				userList.deleteUser();
				System.out.println();
			}else if(select.equals("q")){
				System.out.println("프로그램이 종료됩니다.");
				break;
			}else {
				System.out.println("번호를 다시 입력해주세요.");
				return;
			}
		}
		
		
	}
}






