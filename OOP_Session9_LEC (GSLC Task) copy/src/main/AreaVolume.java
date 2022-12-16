package main;

//SIMILAR TO AN ABSTRACT CLASS (must be overridden)
//except that it does not need any default "content" for its attributes
//Difference is that -> EVERY METHOD DECLARED MUST BE "PUBLIC ABSTRACT"
//ATTRIBUTES will be in "PUBLIC STATIC FINAL" -> can be for "constants" -> though it is preferred to NOT USE it for storing ATRRIBUTES 

public interface AreaVolume {
	
	public abstract double area(); // refers to 2D Area of the face of the Triangle for "Triangle" case
	
	public abstract double volume();
}
