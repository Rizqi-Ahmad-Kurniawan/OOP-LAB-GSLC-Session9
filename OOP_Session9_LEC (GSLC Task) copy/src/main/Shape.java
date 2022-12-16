package main;

//ABSTRACT METHOD MOVED TO -> INTERFACE for area() and Volume()
public abstract class Shape {

	private String shapeName;
	
	public Shape(String shapeName) {
		// TODO Auto-generated constructor stub
		this.shapeName = shapeName;
	}

	// Abstract method 1
	public abstract String toString();
	
	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	
	
}
