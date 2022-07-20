 package j07_반복;


public class For4 {

	public static void main(String[] args) {

		String address = "부산 동래구 사직동";
		
		for(int i = 0; i < 11; i++) {
			String subStr = address.substring(i, i + 1);
			if(subStr.equals(" ")) {
				int index = 0;
				String temp = address.substring(0, i);
				
				if(temp.contains(" ")) {
					// 문자열 중에서 저 문자가 포함되면 true
					index = temp.lastIndexOf(" ") + 1;
					System.out.println(temp.substring(index, i));
				}else {
					System.out.println(temp.substring(0, i));
				}
			}
			if(i == address.length() - 1) {
				System.out.println(address.substring(address.lastIndexOf(" ")));
			}
		}
		
	}

}
