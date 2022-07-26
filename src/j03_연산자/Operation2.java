package j03_연산자;

public class Operation2 {

/*
 * 논리 연산 * 
 * AND연산(&&) - 곱
 * true && true => true (1*1=1)
 * true && false => false (1*0=0)
 * false && false => false (0*0=0)
 * 
 * OR연산(||) - 합
 * true || true => true (1+1=1)
 * true || false => true (1+0=1)
 * false || false => false (0+0=0) 
 * 
 * NOT연산(!) - 부정
 * !true => false
 * !false => true
 * 
 * !(true && false) => true
 */	
	
	public static void main(String[] args) {
		boolean result1 = 10 > 5;
		System.out.println(result1);

		boolean result2 = 10 != 5;
		System.out.println(result2);

		boolean result3 = 10 == 10;
		System.out.println(result3);
		
		System.out.println("" + result2 + result3);
		
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0);

	}

}
