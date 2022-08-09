package j19_익명클래스.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionForEach2 {
	
	public static void main(String[] args) {
		String names = "김준일, 강민지, 박진관, 오유리, 조문기, 김호영, 박소영, 고준호, 서재효, 송상헌, 하덕현";
		int studentCode = 20220001;
		
		//두개의 리스트를 하나의 Map으로 만들어야함
		//Map에 있는 걸 순서대로 출력
		//학번: 200220001, 이름: 김준일 이런식으로
		
		List<String> namesList = new ArrayList<String>(Arrays.asList(names.replaceAll(" ", "").split(",")));
		List<Integer> studentCodeList = new ArrayList<Integer>();
		Map<Integer, String> studentMap = new TreeMap<Integer, String>();
		//TreeMap은 정렬이 된다?
		
		for(int i = 0; i<namesList.size(); i++) {
			studentCodeList.add(studentCode + i);
			studentMap.put(studentCode + i, namesList.get(i));
		}
		
		studentMap.forEach((code, name) -> {
			System.out.println("학번: " + code + ", 이름: " + name);
		});
		
		
		
	}

}
