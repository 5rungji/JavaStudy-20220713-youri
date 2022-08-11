package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {
	public static void main(String[] args) {

		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();

		strMap.put(1, "java1");
		strMap.put(3, "java1");
		strMap.put(2, "java2");
		strMap.put(1, "java3");
		
		//키는 중복 안 됨. 키 값이 동일할 경우 제일 마지막에 들어간게 덮어쓴다.
		//순서는 없다
		System.out.println(strMap);

		strMap2.put("a", "pythone");
		strMap2.put("b", "pythone");
		strMap2.put("c", "pythone");
		strMap2.put("d", "pythone");
		
		System.out.println(strMap2);
		
		strMap.get(1);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
			System.out.println("dma");
		}

		System.out.println(strMap.entrySet());
		System.out.println(strMap);
		
		strMap.entrySet().forEach(arg -> {
			System.out.println(arg);
			System.out.println(arg.getKey());
			System.out.println(arg.getValue());
		});

		
		
	}

}
