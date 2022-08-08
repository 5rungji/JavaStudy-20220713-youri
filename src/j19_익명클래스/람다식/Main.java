package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		//100.5 + 200.5 = 301
		
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() {
			//Math 클래스 생성

			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
				//Math 클래스의 calc는 두 int의 합을 값으로 낸다. 
			}		
		};
		System.out.println(plusMath.calc(10, 20));
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {

			@Override
			public double calc(Double value1, Double value2) {
				return value1 + value2;
			}		
		};
		System.out.println(plusMath2.calc(100.5, 200.5));
		
		
		//람다는 인터페이스만 가능
		//람다식1. 무조건 리턴값이라 중괄호와 리턴 생략 가능.
		Math<Double, Double> plusMath3 = (v1, v2) -> v1 + v2;
		// (v1, v2)[=(매개변수, 매개변수)] ->[=clac] v1 + v2 [=return]
		// 익명클래스를 정의한 것
		System.out.println(plusMath3.calc(50.5, 10.4));
		
		//람다식2. 중괄호가 있으면 로직이 있다. 리턴 꼭 있어야함.
		Math<Double, Double> plusMath4 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;
		};
		System.out.println(plusMath4.calc(50.5, 10.4));
		
	}

}
