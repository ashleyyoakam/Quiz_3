package Quiz3.Quiz_3;

import Exceptions.TriangleException;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	
	//no-arg constructor
	Triangle(){
		side1=1;
		side2=1;
		side3=1;
}
	
	//constructor with specific values
	Triangle(double sideone,double sidetwo,double sidethree) throws TriangleException{
		if(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3)<=0){
			throw new TriangleException("Triangle is imaginary");
		}
		else{
		side1=sideone;
		side2=sidetwo;
		side3=sidethree;
		}
	}
	
	//Accessors
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	//GetPerimiter method
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	//GetArea method
	public double getArea(){
		return Math.pow(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3),.5);
	}
	
	//toString	

	public String toString(){
	    return "created on " + this.getDateCreated() + "\ncolor: " + this.getColor() +
	  	      " and filled: " + this.isFilled();
	}
}