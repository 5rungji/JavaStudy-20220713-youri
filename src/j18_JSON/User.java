package j18_JSON;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	/*
	 * serialize = 객체를 json으로 변환할 때
	 * deserialize = json을 객체로 변환할 때
	 */
	@Expose(serialize = true, deserialize = true) 
	private int userCode;
	@Expose(serialize = true, deserialize = true) 
	@SerializedName("userId") //username을 userid로 표기
	private String username;
	@Expose(serialize = true, deserialize = true) 
	private transient String password; //transient 보안용
	@Expose(serialize = true, deserialize = true) 
	//gson의 어노테이션. transient랑 같은기능
	private String name;
	@Expose(serialize = false, deserialize = true) 
	private String email;
	@Expose(serialize = true, deserialize = true) 
	private String address;
	@Expose(serialize = true, deserialize = true) 
	@SerializedName("phoneNumber")
	private String phone;
	@Expose(serialize = true, deserialize = true) 
	private List<String> hobby;
}
