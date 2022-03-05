public abstract class VehicleAbstract{
	private String color;
	private int year;
	private int numberGear;
	//Implement Basic Constructor and Parametric Constructor;
	VehicleAbstract(){
		this.color = "null";
		this.year = 0;
		this.numberGear = 0;
	}
	VehicleAbstract(String color, int year, int numberGear){
		this.color = color;
		this.year = year;
		this.numberGear = numberGear;
	}
	//set the Mutators
	public void setColor(String color){
		this.color = color;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setNumberGear(int numberGear){
		this.numberGear = numberGear;
	}
	//set the Accessors
	public String getColor(){
		return this.color;
	}
	public int getYear(){
		return this.year;
	}
	public int getNumberGear(){
		return this.numberGear;
	}

}