package j19_익명클래스;

public class Main2 {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.add(10, 20);
		abstractTest.showData("JSON");

	}

	//익명클래스
	//클래스 파일을 따로 만들지 않고 일회용으로 {}에서만 사용하겠다.
	//AbstractTestImpl기능을 1번만 사용하는 일회용
	AbstractTest abstractTest2 = new AbstractTest() {
		
		@Override
		public void showData(String data) {
			System.out.println("여기에서만 사용가능한 data");
			
		}
		
		@Override
		public void add(int num1, int num2) {
			System.out.println("더할 때 딱 한번만 사용가능함");
			
		}
	};
}
