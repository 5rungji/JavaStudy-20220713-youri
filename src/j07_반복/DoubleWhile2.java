package j07_반복;


public class DoubleWhile2 {

	public static void main(String[] args) {

		/*
		 * 1교시
		 * 		1분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간 
		 * 2교시
		 * 		1분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간 
		 * 3교시
		 * 		1분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간 
		 */
		
			
		int i = 0;
		
		while(i < 4) {
			System.out.println((i + 1) + "교시");
			
				int j = 0;				
				while(j < 60) {		
					int time = 0;
					if(j < 50) {
						time = j + 1;
						System.out.println("\t" + time + "분");

					}else{		
						if(j == 50) {
							System.out.println("10분 쉬는시간");
						}	
						time = j - 50 + 1;
						System.out.println("\t" + time + "분 쉬는시간");
					}
					
					j++;
				}	
				
			i++;
		}
	}

}
