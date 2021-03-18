package AdapterPattern;

public class Runner {
	
	public static void main(String[] args) {
		Movable car = new Car();
		System.out.println("Car speed in Km/h  is : " + car.getSpeed());
		
		MovableAdapter carUK = new AdapterImpl();
		System.out.println("Car speed in Mi/h is : " + carUK.getSpeed());
	}

}
