//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class Car{
	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;
	public Car(){}
	public Car(String model, int numGears, float literTank, int yearManufacture){
        this.model = model;
        this.numGears = numGears;
        this.literTank = literTank;
        this.yearManufacture = yearManufacture;
    }
    /**Sets String model, float numGears, float literTank, float yearManufacture.
    *
    * @param Car's attributes 
    */
    public void setmodel (String model){
    	this.model = model;
    } 
    public void setnumGears (int numGears){
    	this.numGears = numGears;
    } 
    public void literTank (float literTank){
    	this.literTank = literTank;
    } 
    public void setyearManufacture (int yearManufacture){
    	this.yearManufacture = yearManufacture;
    } 

    /**Gets String model, float numGears, float literTank, float yearManufacture.
    *
    * @return Car's attributes 
    */
    public String getmodel(){
    	return model;
    }
    public int getnumGears(){
    	return numGears;
    }
    public float getliterTank(){
    	return literTank;
    }
    public int getyearManufacture(){
    	return yearManufacture;
    }
}