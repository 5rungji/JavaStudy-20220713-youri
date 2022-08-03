package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("python");
		set.add("python");

		set.add("1");
		set.add("2");
		
		//순서가 없고 중복이 안된다.
		//순서가 없으므로 get이 없다.
		
		System.out.println(set);
		
		//값 조회
		Iterator<String> ir = set.iterator();

//		System.out.println(ir.hasNext()); // 다음값이 있는지 확인 t/f
//		System.out.println(ir.next()); // 그 값이 어떤건지 알려줌
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
		
		while(ir.hasNext()){
			String str = ir.next();
			if(ir.next().equals("java")) {
				System.out.println(str);
			}
		}
		
		
		
		
		
	}
}
