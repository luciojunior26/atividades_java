package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		double diag = (width * width) + (height * height);
		return Math.sqrt(diag);
	}
	
	public String toString() {
		return "Area : " + area() + "\nPerimeter: " + perimeter() +"\nDiagonal: " + String.format("%.2f",diagonal());			
	} 

}
