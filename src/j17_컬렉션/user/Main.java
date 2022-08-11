package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 * Map 안에 리스트 안에 Map을 저장하는 구조를 배운다.
		 * 
		 */
		
		Map<String, Object> datamap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> todoMap1 = new HashMap<String, Object>();
		todoMap1.put("todoCode", 182);
		todoMap1.put("incompleteCount", 78);
		
		Map<String, Object> todoMap2 = new HashMap<String, Object>();
		todoMap2.put("todoCode", 181);
		todoMap2.put("incompleteCount", 78);
		
		list.add(todoMap1);
		list.add(todoMap2);

		datamap.put("code", 1);
		datamap.put("message", "1page list success to load");
		datamap.put("data", list);
		
		System.out.println(datamap);
		
		/*
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		Map<String, Object> subMap = new HashMap<String, Object>();
		ArrayList<String> mapList = new ArrayList<String>();
		
		map.put("code", 1);
		map.put("message", "1page list success to load");

		subMap.put("todoCode", 182);
		subMap.put("todo", "스프링 부트 서버 테스트_182");
		
		List<Map> subList = Arrays.asList(subMap);
		subList.addAll(subList);
			
		map.put("data", subList);
		
		

		System.out.println(map);
		System.out.println(subList);
		*/
	}

}
