package ilyas.OOPs.class02;

public class Car {
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behaviour
	void drive() {
		System.out.println(make+" can drive");
	}
	void accelerate() {
		System.out.println(make+" can accelerate");
	}
	void makeNoise() {
		System.out.println(make+" can make noise");
	}
	void stop() {
		System.out.println(make+" stops when you prees break");
		System.out.println("Car stops");
	}
	


public static void main(String[] args) {
	
	Car car1=new Car();
	car1.make="Lamborghini";
	car1.model="Gallardo";
	car1.year=2020;
	car1.color="Blue";
	System.out.println(car1.make);
	
	// accesing behavior/methods of Car with car1
			car1.drive();
			car1.accelerate();
			car1.makeNoise();
			car1.stop();
	
	Car car2=new Car();
	car2.make="BMW";
	car2.model="m5";
	car2.year=2019;
	car2.color="Pink";
	
	// accesing behavior/methods of Car with car2
			car2.drive();
			car2.accelerate();
			car2.makeNoise();
			car2.stop();
			System.out.println(car2.make);
	Car car3=new Car();
	car3.make="123";
	car3.speed=200;

	System.out.println("I drive " + car2.color + " " + car2.make);

}
}
