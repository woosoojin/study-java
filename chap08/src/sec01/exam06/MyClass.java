package sec01.exam06;

import sec01.exam03.RemoteControl;
import sec01.exam04.Television;
import sec01.exam04.Audio;

public class MyClass {
	// field
	RemoteControl rc = new Television();
	
	MyClass() {	
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}