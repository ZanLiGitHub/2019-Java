//inherit the class Bicycle 
class RoadBike extends Bicycle{
	private String tyres;
	//Implement Basic Constructor and Parametric Constructor;
	RoadBike(){
		super();
		this.tyres = "null";
	}
	RoadBike(double changeGear, double checkBreak){
		super(changeGear, checkBreak);
		super.getCheckBreak();
		super.getChangeGear();
	}
	RoadBike(String color, int year, int numberGear, boolean is_serviced, String inDate, String outDate, String serviceResponsible,String tyres){
		super(color,year,numberGear,is_serviced,inDate,outDate,serviceResponsible);
		this.tyres = tyres;
		super.getCheckBreak();
		super.getChangeGear();
	}
	//override the method from interface
	public double checkBreak(){
		return getCheckBreak();
	}		
	public double changeGear(){
		return getChangeGear();
	}
	//set the Mutators and the Accessors
	public String getTyres(){
		return this.tyres;
	}
	public void setTyres(String tyres){
		this.tyres = tyres;
	}
	//print the information about the bike
	public void display(){
		System.out.println("The color is: "+getColor()+"\n"+"the year of the bike: "+getYear()+"\n"+"the number of the gear: "+getNumberGear()+"\n"+"whether is serviced: "+getIs_serviced()+"\n"+"date of entering the store: "+getInDate()+"\n"+"date of exiting the store: "+getOutDate()+"\n"+"Service Responsible: "+getServiceResponsible());
		System.out.println("the tyres "+ this.tyres);
		checkoutService();
	}
}