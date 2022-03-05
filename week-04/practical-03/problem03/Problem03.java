import java.util.Scanner;
/**
* Creates a rectangle class with attributes including length and width, methods including 
* printing length and width. 
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
* a1750906/2019/s1/fcs/week-04/practical-03.
*
* @author Zan Li
* @time 04/04/2019
*/

class Rectangle {
    protected double width;
    protected double height;
	public Rectangle(){}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    } 
    public double getWidth() {
        return width;
    } 
    public void setWidth(double width) {
		this.width = width;	
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
		this.height = height;

    }
	public void display(double width, double height){
		System.out.println(width+" "+height);

	}
}

/**
* Created a subclass of the rectangle class, methods including reading the length and 
* width from input, and print area.
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
*
*
*/
class RectangleArea extends Rectangle {
	Scanner input = new Scanner(System.in);
	public double read_input_width(){
		double width = 0.0d;
		System.out.print("width: ");
		width = input.nextDouble();
		if(width >= 1){
			width = width;
		}else{
			System.out.println("width must >= 1");
		}
		return width;
	}
	public double read_input_height(){	
		double height = 0.0d;
		System.out.print("height: ");
		height = input.nextDouble();
		if(height <= 10*10*10){
			height = height;
		}else{
			System.out.println("height must <= 10^3");
		}
		return height;
	}
	public void display(double width, double height){
		System.out.println(width*height);
	}
}