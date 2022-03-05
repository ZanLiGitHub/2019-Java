/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Shape has width, heigth, radius and length.
*/
public class Shape{
	protected double width;
	protected double height;
	protected double radius;
	protected double length;
	public Shape(){}
	public Shape(double width, double height, double radius, double length){
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.length = length;
	}
	public void setwidth(double width){
		this.width = width;
	}
	public double getwidth(){
		return width;
	}
	public void setheight(double height){
		this.height = height;
	}
	public double getheight(){
		return height;
	}
	public void setradius(double radius){
		this.radius = radius;
	}
	public double getradius(){
		return radius;
	}
	
	public void setlength(double length){
		this.length = length;
	}
	public double getlength(){
		return length;
	}	
}