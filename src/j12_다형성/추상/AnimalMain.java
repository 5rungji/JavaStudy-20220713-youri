package j12_다형성.추상;

public class AnimalMain {

	public static void main(String[] args) {
		//Animal animal = new Animal(); 생성 불가. 추상클래스라서.
		Animal animal = new Human(); //부모 대신 자식으로..

	}

}
