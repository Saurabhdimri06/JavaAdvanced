package factory;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String type;
		System.out.println("Enter the type of Vehicle");
		type = sc.next();
		FactoryImplementation obj = new FactoryImplementation();
		Factory f = obj.factoryType(type);
		
		f.generateParts();
	}

}
