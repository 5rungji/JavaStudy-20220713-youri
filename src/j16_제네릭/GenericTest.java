package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<K, V> {
	private K key; //private int number;
	private V value;
	
	// T 는 type
	// E 는 요소(객체)
	
	//int String 같은 걸 자유롭게 조정해주는 변수 느낌?


}
