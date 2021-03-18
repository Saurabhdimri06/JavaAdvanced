package FacadePattern;
import java.util.*;

public class FacadeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Select the Shape you want to draw \n1. Circle \n2. Rectangle \n 3. Square \n4. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			ShapeMaker s = new ShapeMaker();
			switch(ch) {
			
			case 1: {	s.shapeCircle(); }	break;
			case 2: {	s.shapeRectangle();}	break;
			case 3: {	s.shapeSquare();}	break;
			case 4: {	System.out.println("Exiting");	}break;
			default: {	System.out.println("Wrong choice entered"); }	break; 
			
			}
		
		}while(ch!=4);
	}
}
