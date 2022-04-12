package sec01.exam05;

import sec01.exam03.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	// field
	private int volume;
	
	public void turnOn() {
		System.out.println("Turn On the TV.");
	}

	public void turnOff() {
		System.out.println("Turn Off the TV.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("The current volume of the TV: " + this.volume);
	}
	
	public void search(String url) {
		System.out.println("searching" + url);
	}
}
