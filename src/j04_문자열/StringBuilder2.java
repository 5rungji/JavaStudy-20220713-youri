
package j04_문자열;

import java.io.Console;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		int index = 0;
		
		String names = "김준일님, 서재효님, 임나영님, 문창배님, 전나경님";
		// 김준일/서재효/임나영/문창배/전나경
		
		
		/*1번 문제*/
		StringBuilder stringBuilder = new StringBuilder();
		
		index = names.indexOf("님");
		System.out.println(index);
		
		stringBuilder.append(names.substring(index - 3, index))
					//.append(names.substring(0, 3))
					.append("/");
		

		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index))
					//.append(names.substring(6, 9))
					.append("/");
					
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index))
					//.append(names.substring(12, 15))
					.append("/");
					
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index))
					//.append(names.substring(18, 21))
					.append("/");
					
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
					//.append(names.substring(24, 27))
		
		
		System.out.println(stringBuilder.toString());
		
		
		System.out.println();

		
		/*2번 문제*/
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index,index + 3);
		
		index = stringBuilder2.indexOf("님");		
		stringBuilder2.delete(index,index + 3);
		
		index = stringBuilder2.indexOf("님");		
		stringBuilder2.delete(index,index + 3);

		index = stringBuilder2.indexOf("님");		
		stringBuilder2.delete(index,index + 3);

		index = stringBuilder2.indexOf("님");	
		stringBuilder2.delete(index,index + 3);

		System.out.println(stringBuilder2.toString());

		
		}	
}