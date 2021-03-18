package FacadePattern;

public class ShapeMaker {
	private Shape circle; 
	private Shape square;
	private Shape rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}
	
	public void shapeCircle() {
		circle.draw();
	}
	
	public void shapeSquare(){
		square.draw();
	}
	
	public void shapeRectangle(){
		rectangle.draw();
	}
	
}
