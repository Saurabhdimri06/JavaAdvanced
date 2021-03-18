package BuilderDesign;
import java.util.*;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		String ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Choice of meal you want: ");
		ch = sc.next();
		
		if(ch.equalsIgnoreCase("Veg")) {
			Meal VegMeal = mb.prepareVegMeal();
			System.out.println("Veg Meal is selected");
			VegMeal.showItems();
			System.out.println("Total Cost : " + VegMeal.getCost());
		}
		else if(ch.equalsIgnoreCase("NonVeg")) {
			Meal NonVegMeal = mb.prepareNonVegMeal();
			System.out.println("NonVeg meal is selected");
			NonVegMeal.showItems();
			System.out.println("Total Cost : " + NonVegMeal.getCost());
		}
	}

}
