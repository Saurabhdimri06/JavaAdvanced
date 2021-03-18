package AdapterPattern;

public class AdapterImpl implements MovableAdapter{
	private Movable luxuryCars;

	public double getSpeed() {
		// TODO Auto-generated method stub
		
		return convertedSpeed(luxuryCars.getSpeed());
	}
	
	
	private double convertedSpeed(double speed) {
		return speed*1.60934;
	}
}
