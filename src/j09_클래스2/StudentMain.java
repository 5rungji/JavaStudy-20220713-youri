package j09_클래스2;

public class StudentMain {

	
	public static void main(String[] args) {
		int studentCount = 2;
		Student[] studentArray = new Student[studentCount];
		//Student는 자료를 담은 공간?
		//Entity 클래스 (학생의 정보만 담는다)
		
		StudentService service = new StudentService(studentArray);
		//Service는 입력 받는 공간?
		//Service 클래스 (기능을 담고 있다)
		
		while(service.showMainMenu()) { // 메소드가 호출됨
			System.out.println("프로그램 종료");
		}
		

	}

}
