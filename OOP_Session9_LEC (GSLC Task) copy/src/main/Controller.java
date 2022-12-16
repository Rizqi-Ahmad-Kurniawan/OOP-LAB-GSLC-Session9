package main;

import java.util.Scanner;

public class Controller {

	Scanner scan = new Scanner(System.in);
	
	public Controller() {
		// TODO Auto-generated constructor stub
	}

	
	// scan.nextLine() encounter runtime INPUT problems
	// alternative 1: put scan.nextLine() after every scan.nextInt()
	// alternative 2: option = Integer.parseInt(input.nextLine()); -> CHOSEN
	
	
	public void calculateSquare() {
		String shapeName = "";
		double sides;
		
		System.out.println("Input shape name: ");
		shapeName = scan.nextLine();
		System.out.println("Input side length: ");
		sides = Double.parseDouble(scan.nextLine());
		// scan.nextLine(); // consume "\n" character after nextInt();
		
		// Creating Object (for utilising SubClass)
		Square squareObj = new Square(shapeName, sides);
		
		// OUTPUT
		System.out.println("");
		System.out.println("Area of '" + shapeName + "' Square is: " + squareObj.area());
		System.out.println("Volume of '" + shapeName + "' Square is: " + squareObj.volume());
		System.out.println("");
	}
	
	public void calculateRectangle() {
		String shapeName = "";
		double length, width, height;
		
		System.out.printf("Input shape name: ");
		shapeName = scan.nextLine();
		System.out.printf("Input length: ");
		length = Double.parseDouble(scan.nextLine());
		System.out.printf("Input width: ");
		width = Double.parseDouble(scan.nextLine());
		System.out.printf("Input height: ");
		height = Double.parseDouble(scan.nextLine());
		
		// Creating Object (for utilising SubClass)
		Rectangle rectangleObj = new Rectangle(shapeName, length, width, height);
		
		// OUTPUT
		System.out.println("");
		System.out.println("Area of '" + shapeName + "' Rectangle is: " + rectangleObj.area());
		System.out.println("Volume of '" + shapeName + "' Rectangle is: " + rectangleObj.volume());
		System.out.println("");
	}

	public void calculateTriangle() {
		String shapeName = "";
		double length, width, height;
		
		System.out.printf("Input shape name: ");
		shapeName = scan.nextLine();
		System.out.printf("Input length: ");
		length = Double.parseDouble(scan.nextLine());
		System.out.printf("Input width: ");
		width = Double.parseDouble(scan.nextLine());
		System.out.printf("Input height: ");
		height = Double.parseDouble(scan.nextLine());
		
		// Creating Object (for utilising SubClass)
		Triangle triangleObj = new Triangle(shapeName, length, width, height);
		
		// OUTPUT
		System.out.println("");
		System.out.println("Area of '" + shapeName + "' Triangle is: " + triangleObj.area());
		System.out.println("Volume of '" + shapeName + "' Triangle is: " + triangleObj.volume());
		System.out.println("");
	}

	public void calculateCircle() {
		String shapeName = "";
		double radius;
		
		System.out.printf("Input shape name: ");
		shapeName = scan.nextLine();
		System.out.printf("Input circle radius: ");
		radius = Double.parseDouble(scan.nextLine());
		
		// Creating Object (for utilising SubClass)
		Circle circleObj = new Circle(shapeName, radius);
		
		// OUTPUT
		System.out.println("");
		System.out.println("Area of '" + shapeName + "' Circle is: " + circleObj.area());
		System.out.println("Volume of '" + shapeName + "' Circle is: " + circleObj.volume());
		System.out.println("");
	}
	
}
