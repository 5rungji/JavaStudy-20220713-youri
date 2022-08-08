package j19_익명클래스.람다식;

//람다형 인터페이스라고 선언하는 어노테이션
//람다형 인터페이스는 메소드가 하나여야한다.
//메소드가 하나가 아닐 경우 오류가 뜨게 한다.
@FunctionalInterface
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);
}
