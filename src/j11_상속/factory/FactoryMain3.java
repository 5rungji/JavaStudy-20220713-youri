package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		//업캐스팅
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		int num = 10; 
		double dNum = num;
		
		System.out.println(dNum);
		
		int n = (int) dNum;
		
		double d = 3.14; //Factory
		int i = (int)d; //Facotory -> SamsungFactory로 형변환

//		System.out.println((double) num); < 다운캐스팅
//		ㄴ> 위와 같다 double dNum = (double) num;
		
		SamsungFactory sFactory = new SamsungFactory(1);

		//업캐스팅
		// Factory f = (Factory)sFactory; 는 아래처럼 요약가능	
		Factory f = sFactory;
		
		//다운캐스팅 
		// 업캐스팅과 다르게 (SamsungFactory)는 생략불가
		SamsungFactory sf = (SamsungFactory) f; 
		
		
		Factory factory = new Factory(1);
		SamsungFactory samsungFactory = (SamsungFactory) factory;
		//위의 예문은 실행시 에러가 뜬다.
		// 삼성>팩토리 (업캐스팅) > 삼성팩토리(다운캐스팅) 가능!
		// 팩토리>삼성팩토리(다운캐스팅) 불가!
		// [삼성]-가능->[팩토리(업캐스팅)] -불가-> [LG팩토리(다운캐스팅)]
		
	}

}
