//implements the interface and extends the abstract class
class Bicycle extends VehicleAbstract implements Vehicle{
	private boolean is_serviced;
	private String inDate;
	private String outDate;
	private String serviceResponsible;
	//create two varibles to return in the double method which is created in the interface
	private double changeGear;
	private double checkBreak;	
	//Implement Basic Constructor and Parametric Constructor;
	Bicycle(){
		super();
		this.is_serviced = true;
		this.inDate = "null";
		this.outDate = "null";
		this.serviceResponsible = "null";
		this.changeGear = 0d;
		this.checkBreak = 0d;
	}
	Bicycle(String color, int year, int numberGear, boolean is_serviced, String inDate, String outDate, String serviceResponsible, double changeGear, double checkBreak){
		super(color,year,numberGear);
		this.is_serviced = is_serviced;
		this.inDate = inDate;
		this.outDate = outDate;
		this.serviceResponsible = serviceResponsible;
		this.changeGear = changeGear;
		this.checkBreak = checkBreak;
	}
	Bicycle(String color, int year, int numberGear, boolean is_serviced, String inDate, String outDate, String serviceResponsible){
		super(color,year,numberGear);
		
		this.is_serviced = is_serviced;
		this.inDate = inDate;
		this.outDate = outDate;
		this.serviceResponsible = serviceResponsible;
	}
	Bicycle(double changeGear, double checkBreak){
		this();
		this.changeGear = changeGear;
		this.checkBreak = checkBreak;	
	}
	//set a checkout method to judge whether 
	public void checkoutService(){
		if(this.is_serviced){
			System.out.println("The bike is serviced");
		}
		else{
			System.out.println("The bike is not serviced");
		}
	}
	//set the Mutators and the Accessors
	public boolean getIs_serviced(){
		return this.is_serviced;
	}
	public String getInDate(){
		return this.inDate;
	}
	public String getOutDate(){
		return this.outDate;
	}
	public 	String getServiceResponsible(){
		return this.serviceResponsible;
	}
	public void setIs_serviced(boolean is_serviced){
		this.is_serviced = is_serviced;
	}
	public void setInDate(String inDate){
		this.inDate = inDate;
	}
	public void setOutDate(String outDate){
		this.outDate = outDate;
	}
	public 	void setServiceResponsible(String serviceResponsible){
		this.serviceResponsible = serviceResponsible;
	}
	//set two double methods to override the same methods in the interface
	public double checkBreak(){
		
		return getCheckBreak();
	}		 
	public double changeGear(){
		
		return getChangeGear();
	}
	//Accessors
	public double getChangeGear(){
		return this.changeGear;
	}
	public double getCheckBreak(){
		return this.checkBreak;
	}	
	// set the display method , beause in the sub-class need to print the information, so in the case class must have it 	
	public void display(){
	
	}
	
}