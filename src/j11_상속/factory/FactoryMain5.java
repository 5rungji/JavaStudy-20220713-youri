package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		/*
		 *  Factory Array 20
		 *  
		 *  1)
		 *  배열의 인덱스가 짝수이면 SamsungFactory 생성 대입
		 *  배열의 인덱스가 홀수이면 LGFactory 생성 대입
		 *  
		 *  for문 하나로 반복문 사용할 것
		 *  
		 *  삼성공장 1 ~ 10
		 *  LG공장 1 ~ 10
		 *  
		 *  2)
		 *  for문
		 *  
		 *  sa모든 공장 가공
		 *  sa모든 공장 생산
		 *  sa모든 공장 중지
		 *  
		 *  lg모든 공장 가공
		 *  lg모든 공장 생산
		 *  lg모든 공장 중지
		 *  
		 */
		
		Factory Array[] = new Factory[20];
		
		for(int i = 0; i < 20; i++) {
			if(i % 2 == 0) { //짝수일 때
				Array[i] = new SamsungFactory(i / 2 + 1);
			} else {//홀수일 때 
				Array[i] = new LGFactory(i / 2 + 1);
			}			
		}

		for(int i = 0; i < Array.length; i++) {
			Array[i].start();
			if(Array[i] instanceof SamsungFactory) {
				SamsungFactory SamsungFactory = (SamsungFactory) Array[i];				
				SamsungFactory.produceSmartPhone();
			}else if(Array[i] instanceof LGFactory){
				((LGFactory) Array[i]).produceSmartTv();
			}
			Array[i].stop();
			System.out.println();
		}
		
		
		
		
	}

}
