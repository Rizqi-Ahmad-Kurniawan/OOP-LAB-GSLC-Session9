package main;

public class Circle extends Shape implements AreaVolume {

	// Polymorphism (from additional attributes in SubClass)
	double radius;

	public Circle(String shapeName, double radius) {
		super(shapeName);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		// PI.radius squared
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		// SPHERE VOLUME (4/3 PI.radius Cube)
		return (4 / 3) * (Math.PI * Math.pow(radius, 3));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
