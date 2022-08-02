package j11_상속2;

public abstract class ClassA {
	// B랑 C를 엮어주는 존재로만 쓰겠다.
	// 따로 생성자를 만들지 않겠다?
	public ClassA() {
		System.out.println("부모 클래스 생성자 호출");
	}
	
	public void printInfo() {
		System.out.println("부모의 정보를 출력");
		System.out.println();
	}
	
	public abstract void showData(); // 추상메소드. 기본값 X
	
}
