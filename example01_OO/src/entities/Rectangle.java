package entities;

public class Rectangle {

	public double width;
	public double height;
	
	
	public double area() {
		
		double a = width * height;
		
		return a;
		
	}
	
	public double perimeter() {
		
		double p = 2 * (width + height);
		
		return p;
	}
	
	public double diagonal() {
		
		double d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		
		return d;
		
	}
	
	public String toString() {
		
		return "AREA: " + String.format("%.2f", area()) + "\nPERIMETER: " + String.format("%.2f", perimeter()) + "\nDIAGONAL: " + String.format("%.2f", diagonal());
		
	}
	
}
