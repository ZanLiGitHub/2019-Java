import java.util.*;
/**
* Develops several classes for different uses. For each class, accessors and mutators are developed.
* a1750906/2019/s1/fcs/week-04/practical-03.
*
* @author Zan Li
* @time 04/04/2019
*/
public class Classes{
	public static void main(String[] args){
		Person person = new Person("Zan", "Li", 24, "Male", "China");
		Shape shape = new Shape(1.1d,2.2d,3.3d,4.4d);
		Book book = new Book("Hi", 10, "Adelaide", 20);
		Animal animal = new Animal("Luck", 3.5d, "Meat", 1);
	}
}

/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Person has givenName, lastName, age, gender and citizenship.
*/
class Person{
	protected String givenName;
	protected String lastName;
	protected int age;
	protected String gender;
	protected String citizenship;
	public Person(){}
	public Person(String givenName, String lastName, int age, String gender, String citizenship){
		this.givenName = givenName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.citizenship = citizenship;
	}
	public void setgivenName(String givenName){
		this.givenName = givenName;
	}
	public String getgivenName(){
		return givenName;
	}
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	public String getlastName(){
		return lastName;
	}
	public void setage(int age){
		this.age = age;
	}
	public int getage(){
		return age;
	}
	
	public void setgender(String gender){
		this.gender = gender;
	}
	public String getgender(){
		return gender;
	}
	public void setcitizenship(String citizenship){
		this.citizenship = citizenship;
	}
	public String getcitizenship(){
		return citizenship;
	}
}


/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Shape has width, heigth, radius and length.
*/
class Shape{
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

/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Book has title, year, publish and pages.
*/
class Book{
	protected String title;
	protected int year;
	protected String publish;
	protected int pages;
	public Book(){}
	public Book(String title, int year, String publish, int pages){
		this.title = title;
		this.year = year;
		this.publish = publish;
		this.pages = pages;
	}
	public void settitle(String title){
		this.title = title;
	}
	public String gettitle(){
		return title;
	}
	public void setyear(int year){
		this.year = year;
	}
	public int getyear(){
		return year;
	}
	public void setpublish(String publish){
		this.publish = publish;
	}
	public String getpublish(){
		return publish;
	}
	public void setpages(int pages){
		this.pages = pages;
	}
	public int getpages(){
		return pages;
    }
}	

/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Animal has name, weight, favouriteFood and age.
*/
class Animal{
	protected String name;
	protected double weight;
	protected String favouriteFood;
	protected int age;
	public Animal(){}
    public Animal(String name, double weight, String favouriteFood, int age){
	    this.name = name;
	    this.weight = weight;
	    this.favouriteFood = favouriteFood;
	    this.age = age;
    }
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	public void setweight(double weight){
		this.weight = weight;
	}
	public double weight(){
		return weight;
	}
	public void setfavouriteFood(String favouriteFood){
		this.favouriteFood = favouriteFood;
	}
	public String favouriteFood(){
		return favouriteFood;
	}
	public void setage(int age){
		this.age = age;
	}
	public int getage(){
		return age;
	}
}