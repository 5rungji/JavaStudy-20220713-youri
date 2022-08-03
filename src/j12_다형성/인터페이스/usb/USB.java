package j12_다형성.인터페이스.usb;

public interface USB {
	public String VERSION = "2.0";
	
	public void connect(); //추상메소드
	public void disConnect(); //추상메소드
}
