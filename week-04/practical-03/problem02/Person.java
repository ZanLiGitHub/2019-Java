/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Person has givenName, lastName, age, gender and citizenship.
*/
public class Person{
	protected String givenName;
	protected String lastName;
	protected int age;
	protected String gender;
	protected String citizenship;
	public Person(){}
	public Person(String givenName, String lastName, int age, String gender, String citizenship){
		this.givenName = givenName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.citizenship = citizenship;
	}
	public void setgivenName(String givenName){
		this.givenName = givenName;
	}
	public String getgivenName(){
		return givenName;
	}
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	public String getlastName(){
		return lastName;
	}
	public void setage(int age){
		this.age = age;
	}
	public int getage(){
		return age;
	}
	
	public void setgender(String gender){
		this.gender = gender;
	}
	public String getgender(){
		return gender;
	}
	public void setcitizenship(String citizenship){
		this.citizenship = citizenship;
	}
	public String getcitizenship(){
		return citizenship;
	}
}