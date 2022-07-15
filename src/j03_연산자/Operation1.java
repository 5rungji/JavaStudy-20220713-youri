package j03_연산자;

public class Operation1 {

	/*
	 * sysout + space -> System.out.println();
	 * Ctrl + space -> 자동완성
	 * ctrl alt ↓ -> 카피
	 */
	
	
	public static void main(String[] args) {
		int num = 50;

		System.out.println(++num);
		// 앞에 붙으면 지금 바로 num에 1이 더해진다.
		System.out.println(num);
		System.out.println(num++);
		// 뒤에 붙으면 다음번에 num이 사용될 때 1이 더해진다.
		System.out.println(num);		

		System.out.println(--num);
		System.out.println(num);
		System.out.println(num--);
		System.out.println(num);		

	}

}
