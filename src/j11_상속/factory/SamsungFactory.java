package j11_상속.factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}

	@Override //재정의하다
	public void start() {
		System.out.println("삼성 ");
		super.start();
	}
	
	@Override //재정의하다
	public void stop() {
		System.out.println("삼성 ");
		super.start();
	}
	
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}

}
