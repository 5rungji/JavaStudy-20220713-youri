package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		// Gson 객체 생성하는 방법
		
		// 1. Gson() 생성자를 통해 생성
		// 이럴경우 이쁘게 생성이 안 됨
		Gson gson1 = new Gson();
		
		// 2. GsonBuilder() 생성자를 통해 생성
		// ~.create()는 늘 있어야함. builer 뒤에 build 붙던 것처럼
		Gson gson2 = new GsonBuilder().create();
		
		// JSON 이쁘게 출력
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();

		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "skjil1218@kakao.com");

		String json2 = gson2.toJson(map);
		String json3 = gson3.toJson(map);

		System.out.println(json2);
		System.out.println(json3);

	}

}
