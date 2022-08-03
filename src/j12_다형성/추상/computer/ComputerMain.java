package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		//Computer c0 = new Computer(); // 추상이라 객체 직접생산 불가능!
		Computer c1 = new Laptop(); //자식을 업캐스팅해서 객체 생성
		Computer c2 = new DesktopImpl();
		
		c1.onDisplay();
		c1.onkeyPress();
		c1.onSound();
		
		c2.onDisplay();
		c2.onkeyPress();
		c2.onSound();
		
		((Desktop) c2).onMouseClick(); 
		
		//지금 관계가 Computer>Desktop>DesktopImpl이다.
		//DesktopImpl을 Computer로 업클래스했는데
		//Computer은 onMouseClick을 안 가지고 있는거지.
		//그래서 중간단계로 내려준거다.

		Desktop c3 = new DesktopImpl();
		c3.onMouseClick(); 
		//이렇게두 바로 가능함

	}

}
