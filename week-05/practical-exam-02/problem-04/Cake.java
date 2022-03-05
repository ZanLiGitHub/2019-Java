//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class Cake{
	private String name;
	private float qtSugar;
	private float qtFlour;
	private float qtYeast;
	private double timePrepare;
	public Cake(){}
	public Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare){
        this.name = name;
        this.qtSugar = qtSugar;
        this.qtFlour = qtFlour;
        this.qtYeast = qtYeast;
        this.timePrepare  = timePrepare;
    }
    /**Sets String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare
    *
    * @param cake's attributes 
    */
    public void setname (String name){
    	this.name = name;
    } 
    public void setqtSugar (float qtSugar){
    	this.qtSugar = qtSugar;
    } 
    public void qtFlour (float qtFlour){
    	this.qtFlour = qtFlour;
    } 
    public void setqtYeast (float qtYeast){
    	this.qtYeast = qtYeast;
    } 
    public void settimePrepare (double timePrepare){
    	this.timePrepare = timePrepare;
    } 

    /**Gets String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare
    *
    * @return cake's attributes 
    */
    public String getname(){
    	return name;
    }
    public float getqtSugar(){
    	return qtSugar;
    }
    public float getqtFlour(){
    	return qtFlour;
    }
    public float getqtYeast(){
    	return qtYeast;
    }
    public double gettimePrepare(){
    	return timePrepare;
    }
}