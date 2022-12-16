package main;

public class Triangle extends Shape implements AreaVolume {

	// Polymorphism (from additional attributes in SubClass)
	double length;
	double width;
	double height;

	public Triangle(String shapeName, double length, double width, double height) {
		super(shapeName);
		this.length = length;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (width * height) / 2;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return ((width * height) / 2) * length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
