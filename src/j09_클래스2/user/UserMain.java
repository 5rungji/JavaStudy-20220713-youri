package j09_클래스2.user;

public class UserMain {

	public static void main(String[] args) {
		/*
		 * 사용자 정보 시스템
		 * userName(사용자이름)
		 * password(비밀번호)
		 * name(이름)
		 * email(이메일)
		 * 
		 * User 객체
		 * UserService 객체
		 */
		
		//Entity클래스를 리스트 형태로 생성 & 크기 2로 제한 
		int userCount = 2; 
		User[] userArray = new User[userCount];
		
		//Service클래스. userArray를 받아온다
		//userArray를 UserService로 전달!
		UserService service = new UserService(userArray);
		
		
		while(service.showMainMenu()){
			System.out.println("프로그램 종료");
		}
		
	}

}
