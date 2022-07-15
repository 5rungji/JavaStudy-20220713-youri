package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("\"안녕하세요\"");
		// " 를 사용하고 싶을 때는 앞에 \를 사용한다.
		
		String address = "부산시 동래구 사직동";
		// 문자열에서 해당 문자열의 값을 찾아 위치를 알려준다.
		int index1 = address.indexOf("동");
		System.out.println(index1);
		int index2 = address.lastIndexOf("동");
		System.out.println(index2);
		
		String subAddress = address.substring(1, 5);
		// 1부터 5전까지 = 0 ~ 4
		// 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		System.out.println(subAddress);
		
		String subAddress2 = address.substring(index1,index2 + 1);
		System.out.println(subAddress2);		
		
		String subAddress3 = address.substring(index1);
		System.out.println(subAddress3);
		
		// 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll("-"," ");
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/9988/1916, 010/1234/5678";

		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		System.out.println(rePhone2);
	}

}
