//inherit the class Bicycle 
class MountainBike extends Bicycle{
	private String suspension;
	private String forks;
	//Implement Basic Constructor and Parametric Constructor;
	MountainBike(){
		super();
		this.suspension = "null";
		this.forks = "null";
	}
	MountainBike(double changeGear, double checkBreak){
		super(changeGear, checkBreak);
		super.getCheckBreak();
		super.getChangeGear();
	}
	MountainBike(String color, int year, int numberGear, boolean is_serviced, String inDate, String outDate, String serviceResponsible,String suspension, String forks){
		super(color,year,numberGear,is_serviced,inDate,outDate,serviceResponsible);
		this.suspension = suspension;
		this.forks = forks;
	}
	//override the method from interface
	public double checkBreak(){	
		return getCheckBreak();
	}		
	public double changeGear(){
		return getChangeGear();
	}
	//set the Mutators and the Accessors
	public String getSuspension(){
		return this.suspension;
	}
	public void setSuspension(String suspension){
		this.suspension = suspension;
	}
	public String getForks(){
		return this.forks;
	}
	public void setForks(String forks){
		this.forks = forks;
	}
	//print the information about the bike
	public void display(){
		System.out.println("The color is: "+getColor()+"\n"+"the year of the bike: "+getYear()+"\n"+"the number of the gear: "+getNumberGear()+"\n"+"whether is serviced: "+getIs_serviced()+"\n"+"date of entering the store: "+getInDate()+"\n"+"date of exiting the store: "+getOutDate()+"\n"+"Service Responsible: "+getServiceResponsible());
		System.out.println("the suspension "+ this.suspension+"\n"+"the forks of bike: "+ this.forks);
		checkoutService();
	}
} 