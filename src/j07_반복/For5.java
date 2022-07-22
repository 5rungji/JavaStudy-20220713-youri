 package j07_반복;


public class For5 {

	public static void main(String[] args) {

		String address = "부산 동래구 사직동 중앙대로 114 KIM 22 용이대로";
		
		String a = null;
		String b = null;
		String c = null;

		boolean startFlag = true;
		
		while(true) {
			int sliceIndex = address.indexOf(" ") + 1;
			// 가장 처음에 있는 " " 를 찾는다
			int nextSliceIndex = address.indexOf(" ", sliceIndex);
			// 두번째 있는 " " 를 찾는다
			
			if(nextSliceIndex == -1) { // " " 가 더 이상 없을 때(마지막일때)
				c = address.substring(sliceIndex);
				// 마지막 단어를 변수 c에 담아서 출력한다
				System.out.println(c);				
				break; // 반복중지
			}

			if(startFlag) {
				a = address.substring(0, sliceIndex);
				System.out.println(a);
				startFlag = false;
			}
			
			a = address.substring(sliceIndex, nextSliceIndex);
			// 첫 " " ~ 두번째 " " 사이를 출력
			System.out.println(a);
			
			address = address.substring(nextSliceIndex);
			// 이미 출력한 단어를 버리고 나머지만 남긴다.
		}
		
		
//		for(int i = 0; i < address.length(); i++) {
//			String subStr = address.substring(i, i + 1);
//			// 한글자씩 잘라주는 역할
//			if(subStr.equals(" ")) {
//				int index = 0;
//				String temp = address.substring(0, i);
//				
//				if(temp.contains(" ")) {
//					// 문자열 중에서 저 문자가 포함되면 true
//					index = temp.lastIndexOf(" ") + 1;
//					System.out.println(temp.substring(index, i));
//				}else {
//					System.out.println(temp.substring(0, i));
//				}
//			}
//			if(i == address.length() - 1) {
//				System.out.println(i);
//				System.out.println(address.substring(address.lastIndexOf(" ") + 1));
//			}
//		}
		
	}

}
