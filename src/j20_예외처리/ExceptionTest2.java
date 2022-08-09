package j20_예외처리;

public class ExceptionTest2 {
	
	public void printArray() throws Exception { 
		//throws Exception 예외가능성이 있음. 강제적으로 메인에서 예외처리 하게 해줌
		int[] numArray = new int[] { 1 , 2 , 3  , 4 , 5 };
		
		if(0==0) throw new CustomException("내가만든 예외 강제로 발생");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(numArray[i]);
		}
	}


}
