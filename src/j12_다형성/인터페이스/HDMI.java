package j12_다형성.인터페이스;

public interface HDMI extends ConnectionTerminal{
	public String VERSION = "2.0"; //기본적으로 static 상수를 가진다.
	
	public void soundOutput();

}
