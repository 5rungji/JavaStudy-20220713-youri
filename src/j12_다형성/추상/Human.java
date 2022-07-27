package j12_다형성.추상;

public class Human extends Animal {
	
	
//abstractMethod 메소드를 상속받았기 떄문에 
//override가 꼭 포함되어 있어야 한다
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}
