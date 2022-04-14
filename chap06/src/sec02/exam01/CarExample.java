package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("Company Name: " + myCar.company);
		System.out.println("Model: " + myCar.model);
		System.out.println("Color: " + myCar.color);
		System.out.println("Max Speed: " + myCar.maxSpeed);
		System.out.println("Current Speed: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("Chaned speed: " + myCar.speed);
	}
}
