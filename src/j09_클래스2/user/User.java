package j09_클래스2.user;

public class User {
	private String userName;
	private String password;
	private String name;
	private String email;

	
	//기본 생성자
	public User() {
		System.out.println("User 객체를 생성할 때 호출되는 기본 생성자");
	}

	
	//생성자 자동생성 중 전체생성자
	public User(String userName, String password, String name, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	

	//getter & setter로 전부 자동 생성함
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	//toString 자동생성함 (나중에 뭘 입력했는지 알려주는거)
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
}
