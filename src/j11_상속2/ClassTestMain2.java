package j11_상속2;

public class ClassTestMain2 {

	public static void main(String[] args) {
		
		((ClassA) new ClassB()).showData();
		
		ClassB bb = new ClassB();
		ClassA aa = bb;
		
		ClassA aaa = new ClassB();
		
		((ClassA) bb).showData();
		((ClassA) bb).printInfo();
		
		aa.showData();
		bb.printInfo();
		
		
		ClassA b = new ClassB();
//		new ClassB();
		b.printInfo();
		b.showData();
		
		ClassA c = new ClassC();
		c.printInfo();
		// 위와동일 new ClassC().printInfo();
		c.showData();

	}

}
