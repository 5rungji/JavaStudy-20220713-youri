package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		System.out.println((new Car()).toString());
		Car a1 = new Car();
		Car a2 = new Car();
		Car a3 = new Car();

		a1.company = "현대자동차";
		a1.model = "쏘나타";
		a1.color = "화이트";
		
		a1.showinfo();

		a2.company = "기아";
		a2.model = "K5";
		a2.color = "블랙";
		
		a2.showinfo();
		
		a3.company = "현대자동차";
		a3.model = "아반떼";
		a3.color = "그레이";
		
		a3.showinfo();

	}

}
