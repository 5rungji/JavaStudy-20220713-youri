package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson2 {
	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				//@Expose(serialize = false) 를 사용하게 해줌
				.serializeNulls()//생략하면 null 값이 사라진다.
				.setPrettyPrinting().create();
		
		
		
		//객체를 JSON으로 변환 -> toJson(객체)
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		System.out.println();
		
		//JSON을 객체로 변환 -> fromJson(jsonText문자열, 변환할 객체 클래스)
		User userObj = gson.fromJson(userJson, User.class);
		
		System.out.println(userObj);
		System.out.println(userObj.getAddress());
		
		
		
	}

}
