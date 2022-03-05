/*==================================
Foundations of Computer Science
Student: Zan Li
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 03
===================================*/

/**
* A public class of tesla extends electric
*/
public class Tesla extends Electric{
    private float kpW = 10.0f;
	private float fuel;
	private float kms = 0.0f;
	private float power;
	private String model;
    Tesla(){}
    Tesla(float kpW, float fuel, float kms, float power, String model){
        this.kpW = kpW;
        this.fuel = fuel;
        this.kms = kms;
        this.power = power;
        this.model = model;
    }
    public void setKpW(float kpW){
        this.kpW = kpW;
    }
    public float getKpW(){
        return kpW;
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
    * Let car move, consider kpW, power and fuel
    *
    * @param kpW, power, fuel
    */
	public void move (float kpW, float power, float fuel){
    	if (kpW>0 && power>0 && fuel>0){
    		System.out.println("Porches are capable of moving 10 km per round");
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
    	if (fule == 100.0f){
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