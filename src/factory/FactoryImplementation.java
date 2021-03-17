package factory;

public class FactoryImplementation {
	public Factory factoryType(String name) {
		if(name.equalsIgnoreCase("Audi"))	return new AudiFactory();
		else if(name.equalsIgnoreCase("MErcedez"))	return new MercedezFactory();
		else System.out.println("Wrong Factory Selected!!!!");
		
		return null;
	}
}
