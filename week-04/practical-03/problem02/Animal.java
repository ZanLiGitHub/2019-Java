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