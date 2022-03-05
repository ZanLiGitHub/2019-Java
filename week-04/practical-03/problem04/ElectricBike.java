//inherit the class Bicycle 
class ElectricBike extends Bicycle {
	private String battery;
	//Implement Basic Constructor and Parametric Constructor;
	ElectricBike(){
		super();
		this.battery = "null";
	}
	ElectricBike(String color, int year, int numberGear, boolean is_serviced, String inDate, String outDate, String serviceResponsible,String battery){
		super(color,year,numberGear,is_serviced,inDate,outDate,serviceResponsible);
		getColor();
		getYear();
		getNumberGear();
		getIs_serviced();
		getInDate();
		getOutDate();
		getServiceResponsible();
		this.battery = battery;
	}
	ElectricBike(double changeGear, double checkBreak){
	
		super(changeGear, checkBreak);
		super.getCheckBreak();
		super.getChangeGear();
	}
	public void chargeBike(){
		System.out.println("Charging completed");
	}
	//override the method from interface
	public double checkBreak(){
		
		return getCheckBreak();
	}		
	public double changeGear(){
		
		return getChangeGear();
	}
	//set the Mutators and the Accessors
	public String getBattery(){
		return this.battery;
	}
	public void setBattery(String battery){
		this.battery = battery;
	}
	//print the information about the bike
	public void display(){
		System.out.println("The color is: "+getColor()+"\n"+"the year of the bike: "+getYear()+"\n"+"the number of the gear: "+getNumberGear()+"\n"+"whether is serviced: "+getIs_serviced()+"\n"+"date of entering the store: "+getInDate()+"\n"+"date of exiting the store: "+getOutDate()+"\n"+"Service Responsible: "+getServiceResponsible());
		System.out.println("the voltage of the battery: "+ this.battery);
		chargeBike();
		checkoutService();
	}
}


