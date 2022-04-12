package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Audio implements RemoteControl {
	// field
	private int volume;
	
	public void turnOn() {
		System.out.println("Turn On the Audio.");
	}
	
	public void turnOff() {
		System.out.println("Turn Off the Audio.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("The current volume of the audio: " + this.volume);
	}
}