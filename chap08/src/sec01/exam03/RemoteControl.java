package sec01.exam03;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
