package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		int num = 10;
		int[] numbers = new int[2];
		
		numbers[0] = num;
		
		System.out.println(numbers[0]);
		
		ClassA b =new ClassB();
		ClassA[] arrayA = new ClassA[3]; //ClassA객체만 들어올수있다
		arrayA[0] = b;
		arrayA[1] = new ClassC();

		for(int i = 0; i<arrayA.length; i++) {
//			arrayA[i].printInfo();		
			// [0] B.printInfo()
			// [1] C.printInfo();
			// [2] null.printInfo(); > 에러가 뜸
			
			if(arrayA[i] instanceof ClassB) {
				ClassB b3 = (ClassB) arrayA[i];
				b3.addData();
			}else if((arrayA[i] instanceof ClassC)) {
				ClassC c3 = (ClassC) arrayA[i];
				c3.removeData();
			}else {
				System.out.println("다운 캐스팅 불가");
			}			
		}

		
		
		
	}

}
