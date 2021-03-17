package factory;

public class AudiFactory implements Factory{

	@Override
	public void generateParts() {
		// TODO Auto-generated method stub
		AudiTire t = new AudiTire();
		AudiLight h = new AudiLight();
		
		t.makeTire();
		h.makeHeadlight();
	}
	
}
