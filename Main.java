package Lab9;

public class Main {
	  public static void main(String[] args) {
	    // Create a circle with radius 5, color red, and filled
	    Circle circle = new Circle(5, "red", true);
	    System.out.println("Circle: ");
	    System.out.println("Radius: " + circle.getRadius());
	    System.out.println("Area: " + circle.getArea());
	    System.out.println("Perimeter: " + circle.getPerimeter());
	    System.out.println("Diameter: " + circle.getDiameter());
	    System.out.println("Color: " + circle.getColor());

	    // Create a rectangle with width 4, height 6, color blue, and not filled
	    Rectangle rectangle = new Rectangle(4, 6, "blue", false);
	    System.out.println("\nRectangle: ");
	    System.out.println("Width: " + rectangle.getWidth());
	    System.out.println("Height: " + rectangle.getHeight());
	    System.out.println("Area: " + rectangle.getArea());
	    System.out.println("Perimeter: " + rectangle.getPerimeter());
	    System.out.println("Color: " + rectangle.getColor());
	  }
	}
