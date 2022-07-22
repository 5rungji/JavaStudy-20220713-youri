package j09_클래스.접근지정자.student;

public class Student { 
	// 모든 변수는 무조건 private
	private String name;
	private int studentYear;
	private int age;
	private String addres;
	private String phone;
	
	public Student() {} // 기본생성자. 아래의 것들을 쓰려면 기본생성자 필요
	
	// private 변수에 값을 주입하는 방법 1
	// [생성자↓를 통한 값 주입]
	public Student(String name, int studentYear, int age, String addres, String phone) {
		super();
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.addres = addres;
		this.phone = phone;
	}
	
	// private 변수에 값을 주입하는 방법 2
	// [Setter↓를 통한 값 주입]
	public void setName(String name) {
		this.name = name;
	}
	
	// private 변수의 값을 가져오는 방법
	// [Getter↓]
	public String getName() {
		return name; // 이곳의 name을 외부로 전달해준다.
	}

	/*------아래는 단축키 이용------*/
	
	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
