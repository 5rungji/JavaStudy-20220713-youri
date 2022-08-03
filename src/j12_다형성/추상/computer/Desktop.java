package j12_다형성.추상.computer;

public abstract class Desktop extends Computer {

	@Override
	public void onkeyPress() {
		System.out.println("컴퓨터의 키보드 입력을 받는다.");
	}

	public abstract void onMouseClick();
	// 추상 메소드를 가지고 있으므로 추상 메소드가 되어야 한다.
	// onDisplay()를 오버라이드 하지 않았으므로 추상메소드가 되어야한다.
}
