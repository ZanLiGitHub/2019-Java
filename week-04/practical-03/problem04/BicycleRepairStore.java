import java.util.*;
/**
* Develop a Bicycle Repair Store. The system needs an Input/Output interface
* to keep track of the bicycles that have been serviced.
* a1750906/2019/s1/fcs/week-04/practical-03.
*
* @author Zan Li
* @time 04/04/2019
*/
public class BicycleRepairStore{
	
}

/**
* This interface includes a changeGear method and a checkBreak methods
* 
* @return a double 
*/
interface IVehicle{
	public abstract double changeGear();
	public abstract double checkBreak();
}

/**
* Provides vehicle's basic attributes, color, year and numberGears. 
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
* 
* @param String color, String year, String numberGears
* @return String color, String year, String numberGears
*/
abstract class Vehicle{
    protected String color;
	protected String year;
	protected String numberGears;
	public Vehicle(){}
	public Vehicle(String color, String year, String numberGears){
		this.color = color;
		this.year = year;
		this.numberGears = numberGears;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
		public void setYear(String year){
		this.year = year;
	}
	public String getYear(){
		return year;
	}
	public void setNumberGears(String numberGears){
		this.numberGears = numberGears;
	}
	public String getNumberGears(){
		return numberGears;
	}
}

/**
* Provides bicycle's basic attributes,boolean is_serviced, String inDate, String stroutDate, String serviceResponsible. 
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
* 
* @param boolean is_serviced, String inDate, String stroutDate, String serviceResponsible
* @return boolean is_serviced, String inDate, String stroutDate, String serviceResponsible
*/
class Bicycle extends Vehicle{
    protected boolean is_serviced;
	protected String inDate;
	protected String stroutDate;
	protected String serviceResponsible;
	public Bicycle(){}
	public Bicycle(boolean is_serviced, String inDate, String stroutDate, String serviceResponsible){
		this.is_serviced = is_serviced;
		this.inDate = inDate;
		this.stroutDate = stroutDate;
		this.serviceResponsible = serviceResponsible;
	}
	public void setis_serviced(boolean is_serviced){
		this.is_serviced = is_serviced;
	}
	public boolean getis_serviced(){
		return is_serviced;
	}
	public void setinDate(String inDate){
		this.inDate = inDate;
	}
	public String getinDate(){
		return inDate;
	}
	public void setstroutDate(String stroutDate){
		this.stroutDate = stroutDate;
	}
	public String getstroutDate(){
		return stroutDate;
	}
	public void setserviceResponsible(String serviceResponsible){
		this.serviceResponsible = serviceResponsible;
	}
	public String getserviceResponsible(){
		return serviceResponsible;
	}
	public void checkoutService(String inDate, String stroutDate, String serviceResponsible){
	}
}

/**
* Provides ElectricBike's String battery, and a method called chargeBike.
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
* 
* @param String battery
* @return String battery
*/
class ElectricBike extends Bicycle{
    protected String battery;
	public ElectricBike(){}
	public ElectricBike(String battery){
		this.battery = battery;
	}
	public void setbattery(String battery){
		this.battery = battery;
	}
	public String getbattery(){
		return battery;
	}
    public void chargeBike(String battary){
	}
}

/**
* Provides MountainBike's basic attributes, String suspension, String forks.
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
* 
* @param String suspension, String forks
* @return String suspension, String forks
*/
class MountainBike extends Bicycle{
    protected String suspension;
	protected String forks;
	public MountainBike(){}
	public MountainBike(String suspension, String forks){
		this.suspension = suspension;
		this.forks = forks;
	}
	public void setsuspension(String suspension){
		this.suspension = suspension;
	}
	public String getsuspension(){
		return suspension;
	}
	public void setforks(String forks){
		this.forks = forks;
	}
	public String getforks(){
		return forks;
	}
}
		
class RoadBike extends Bicycle{
    protected String tyres;
	public RoadBike(){}
	public RoadBike(String tyres){
		this.tyres = tyres;
	}
	public void settyres(String tyres){
		this.tyres = tyres;
	}
	public String gettyres(){
		return tyres;
	}
}

/**
* Provides Hibrid's String suspension.
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor.
* 
* @param String suspension
* @return String suspension
*/
class Hibrid extends Bicycle{
    protected String suspension;
	public Hibrid(){}
	public Hibrid(String suspension){
		this.suspension = suspension;
	}
	public void setsuspension(String suspension){
		this.suspension = suspension;
	}
	public String getsuspension(){
		return suspension;
	}
}
