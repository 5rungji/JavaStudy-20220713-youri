package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
		double c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		int d = (int) c;
		// double 자료형인 c를 int로 바꾸겠다고 명시하는 (int)
		// 업캐스팅할때는 명시X 다운캐스팅할때는 명시해야함!

		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);
		//char>int 가능 char>double 불가능
		//캐스팅 순서
		//byte > sort > int > long > float > double
	}

}
