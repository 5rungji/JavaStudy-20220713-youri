package j11_상속.factory;

public class Factory {
	private int factoryNumber; // private이라서 상속x.
	
	public Factory(int factoryNumber) {
		this.factoryNumber = factoryNumber;
	} //부모생성자. 만약 private로 바뀌면 상속x 

	public void start() {
		System.out.println(factoryNumber + "공장을 가동합니다.");
	}
	
	public void stop() {
		System.out.println(factoryNumber + "공장을 멈춥니다.");
	}

}
