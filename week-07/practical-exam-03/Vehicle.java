/*==================================
Foundations of Computer Science
Student: Zan Li
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 03
===================================*/

/**
* A public class of Vehicle for future extends
*/
public class Vehicle implements VehicleInterface{
	protected float fuel;
	protected float kms = 0.0f;
	protected float power;
	protected String model;
	Vehicle(){}
	Vehicle(float fuel, float kms, float power, String model){
		this.fuel = fuel;
		this.kms = kms;
		this.power = power;
		this.model = model;
	}
	public void setFuel(float fuel){
		this.fuel = fuel;
	}
	public float getFuel(){
        return fuel;
	}
	public void setKms(float kms){
		this.kms = kms;
	}
	public float getKms(){
        return kms;
	}
	public void setPower(float power){
		this.power = power;
	}
	public float getPower(){
        return power;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
        return model;
	}
	public void move(){};
	public void reFill(){};

	/**
    * Print fuel and kms
    *
    * @param fuel, kms
    */
	public void displayTravel(float fuel, float kms){
		System.out.println(fuel+" "+kms);
	}
}