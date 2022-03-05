//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class Character{
	//this attribute storage the character name;
	private String name;
	// this attribute storage the character age;
	private int age;
	// this attribute storage the character gender;
	private String gender;
	// this attribute storage the character occupation;
	private String occupation;
	// this attribute storage the family role;
	private String familyRole;
	// this attribute storage the character overall rate by fans;
	private float rate;
	public Character(){}
	public Character(String name, int age, String gender, String occupation, String familyRole, float rate){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.familyRole = familyRole;
        this.rate = rate;
    }
    /**Sets name, age, gender, occupation, familyrole and rate
    *
    * @param person's attributes 
    */
    public void setname (String name){
    	this.name = name;
    } 
    public void setage (int age){
    	this.age = age;
    } 
    public void setgender (String gender){
    	this.gender = gender;
    } 
    public void setoccupation (String occupation){
    	this.occupation = occupation;
    } 
    public void setfamilyRole (String familyRole){
    	this.familyRole = familyRole;
    } 
    public void setrate (float rate){
    	this.rate = rate;
    } 

    /**Gets name, age, gender, occupation, familyrole and rate
    *
    * @return person's attributes 
    */
    public String getname(){
    	return name;
    }
    public int getage(){
    	return age;
    }
    public String getgender(){
    	return gender;
    }
    public String getoccupation(){
    	return occupation;
    }
    public String getfamilyRole(){
    	return familyRole;
    }
    public float rate(){
    	return rate;
    }
}