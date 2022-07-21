 package j07_반복;


public class For5 {

	public static void main(String[] args) {

		String address = "부산 동래구 사직동 중앙대로 114 KIM 22 용이대로";
		
		String a = null; //부산
		String b = null; //동래구
		String c = null; //사직동
		String d = null; //중앙대로


		address = " " + address; // 없애는 방법은 없나?
		// 아래서 address.substring(0, sliceIndex); 를 한번만 출력하는 방법?
		
		while(true) {
			int sliceIndex = address.indexOf(" ") + 1;
			int nextSliceIndex = address.indexOf(" ", sliceIndex);
		
			if(nextSliceIndex == -1) {
				d = address.substring(sliceIndex);
				System.out.println(d);				
				break;
			}
			
			a = address.substring(sliceIndex, nextSliceIndex);
			System.out.println(a);
			
			address = address.substring(nextSliceIndex);
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
