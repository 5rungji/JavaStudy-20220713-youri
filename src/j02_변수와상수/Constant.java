package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		//final은 상수, 변하며 안되는 기준값
		//선언과 초기화는 1회 가능.
		//상수는 전부 대문자로 사용 + 스네이크 표기법
		
		int number = 10;
		
		System.out.println("최소값: " + MIN_NUMBER);
		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("현재값: " + number);
	}

}
