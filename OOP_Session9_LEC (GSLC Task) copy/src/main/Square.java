package main;

public class Square extends Shape implements AreaVolume {
	
	// Polymorphism (from additional attributes in SubClass)
	double sides;
	
	public Square(String shapeName, double sides) {
		super(shapeName);
		this.sides = sides;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return sides * sides;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return sides * sides * sides;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
