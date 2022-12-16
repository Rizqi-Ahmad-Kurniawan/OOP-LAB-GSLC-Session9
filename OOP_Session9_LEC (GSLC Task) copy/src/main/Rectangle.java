package main;

public class Rectangle extends Shape implements AreaVolume {

	// Polymorphism (from additional attributes in SubClass)
	double length;
	double width;
	double height;

	public Rectangle(String shapeName, double length, double width, double height) {
		super(shapeName);
		this.length = length;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}



	// From AreaVolume Interface as parent class
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	// From AreaVolume Interface as parent class
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return length * width * height;
	}

	// From Shape Abstract Superclass
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
