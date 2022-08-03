package j12_다형성.추상;

/*
 * 추상
 * 추상 메소드가 하나라도 포함되어 있는 클래스는 
 * 무조건 추상 클래스로 정의해야 한다.
 */

//abstractMethod(추상메소드)
public abstract class Animal {
	public abstract void move(); //생성자
	
}

/*
//기본 메소드인데 자손에 공통되는 내용
 * +override 할거라 생략가능한 메소드 일 경우에는 추상메소드 쓴다
public class Animal {
	public void move() {}	
}
*/
