package j11_상속.factory;

public class LGFactory extends Factory {

	public LGFactory(int factoryNumber) {
		super(factoryNumber);
	}

	@Override
	public void start() {
		System.out.println("LG ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.println("LG ");
		super.start();
	}
	
	public void produceSmartTv() {
		System.out.println("LG 스마트 TV를 생산합니다.");
	}
	
}
