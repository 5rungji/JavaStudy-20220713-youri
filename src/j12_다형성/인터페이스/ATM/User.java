package j12_다형성.인터페이스.ATM;

import lombok.Data;

@Data
public class User {
	public static int autoCode = 20220000;

	private int bankCode;
	private String name;
	
	public User(String name) {
		bankCode = ++autoCode;
		this.name = name;
	}
	
}
