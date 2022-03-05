/*==================================
Foundations of Computer Science
Student: Zan Li
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 03
===================================*/

/**
* A public class of proche extends petrol
*/
public class Porche extends Petrol{
	float kpL = 4.2f;
    float fuel;
	float kms = 0.0f;
	float power;
	String model;
    Porche(){}
    Porche(float kpL, float fuel, float kms, float power, String model){
        this.kpL = kpL;
        this.fuel = fuel;
        this.kms = kms;
        this.power = power;
        this.model = model;
    }
    public void setKpL(float kpL){
        this.kpL = kpL;
    }
    public float getKpL(){
        return kpL;
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
    
    /**
    * Let car move, consider kpL, power and fuel
    *
    * @param kpL, power, fuel
    */
    public void move (float kpL, float power, float fuel){
        if (kpL>0 && power>0 && fuel>0){
    	    System.out.println("Porches are capable of moving 14 km per round");
    	}
        else{
		    System.out.println("Can not move");
        }
    }

    /**
    * Check if the tank is full
    *
    * @param a float fuel
    */
    public void reFill(float fuel){
    	if (fuel == 60.0f){
    		System.out.println("The tank is full");
    	}
    	else {
    		System.out.println("The tank is not full");
    	}
    }

    /**
    * Print fuel and kms
    *
    * @param fuel, kms
    */
    public void displayTravel(float fuel, float kms){
        System.out.println(fuel+" "+kms);
    }
}