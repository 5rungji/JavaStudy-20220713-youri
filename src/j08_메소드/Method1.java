package j08_메소드;

public class Method1 {

	public static void printData(String data) { // String data가 지역변수+매개변수
		while(true) {
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@" , 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);
			
			System.out.println(command + ": " + content);
			
			if(nextCommandIndex == -1) {
				break;
			}
			
			data = data.substring(nextCommandIndex);
		}		
		
		System.out.println("---------------");
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {	
		
		String data1 = "@Message:안녕하세요1.@To:김준일@From:김준이@SendDate:2022/07/32";
		String data2 = "@Message:안녕하세요2.@To:김준일@From:김준이@SendDate:2022/07/32";
		String data3 = "@Message:안녕하세요3.@To:김준일@From:김준이@SendDate:2022/07/32";

		printData(data1);
		printData(data2);
		printData(data3);
				
	}

}
