package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImpl();
		
		c1.onDisplay();
		c1.onkeyPress();
		c1.onSound();
		
		c2.onDisplay();
		c2.onkeyPress();
		c2.onSound();
		
		((Desktop) c2).onMouseClick(); 
		//마우스클릭은 데스크탑에만 있따.
		//그래서 데스크탑으로 다운클래스해따 ? 업클래스가아니라?
		

	}

}
