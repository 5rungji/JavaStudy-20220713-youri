package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {

	public static void main(String[] args) {
		/*
		 * Map 안에 리스트 안에 Map을 저장하는 구조를 배운다.
		 * 
		 */
		
		Map<String, Object> JsonObject = new HashMap<String, Object>();
		
		Map<String, Object> SubObject1 = new HashMap<String, Object>();
		Map<String, Object> SubObject2 = new HashMap<String, Object>();

		List<Map<String, Object>> objectList = new ArrayList<Map<String, Object>>();
		
		SubObject1.put("name", "bulbasaur");
		SubObject1.put("url", "http://bulbasaur.com");
		
		SubObject2.put("name", "ivysaur");
		SubObject2.put("url", "http://ivysaur.com");

		objectList.add(SubObject1);
		objectList.add(SubObject2);
		
		JsonObject.put("count", 1118);
		JsonObject.put("next", "http://naver.com");
		JsonObject.put("previout", null);
		
		JsonObject.put("results", objectList);
		
		System.out.println(JsonObject);
		
	}

}
