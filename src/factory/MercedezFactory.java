package factory;

public class MercedezFactory implements Factory{

	@Override
	public void generateParts() {
		// TODO Auto-generated method stub
		MercedezLight l = new MercedezLight();
		MercedezTire t = new MercedezTire();
		
		l.makeHeadlight();
		t.makeTire();
	}
	
}
