package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor //필수인 생성자를 도와줌
public class User {
	
	private final String email; 
	//final 초기화 해야함. 무조건 값이 들어가야함. 필수면서 값 바꿀수없다
	private String name;
	@NonNull //꼭 값을 넣어야 한다
	private String username;
	@NonNull 
	private String password;
	
//	public User(String username, String password) {
//		this.username = username;
//		this.password = password;
//	}

}
