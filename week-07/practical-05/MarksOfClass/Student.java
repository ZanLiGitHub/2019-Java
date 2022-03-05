//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================

public class Student{

	private String name;
	private int physic;
	private int chemistry;
	private int math;
	private double average = (physic+chemistry+math)/3;

	

	public Student(){}
	public Student(String name, int physic, int chemistry, int math, double average){
		this.name = name;
		this.physic = physic;
		this.chemistry = chemistry;
		this.math = math;
        this.average = average;
	}    



	public void setName (String name) {
		this.name = name;
	}
    public void setPhysic (int physic) {
    	this.physic = physic;
    }
    public void setChemistry (int chemistry) {
    	this.chemistry = chemistry;
    }
    public void setMath (int math) {
    	this.math = math;
    }


    public String getName () {
    	return name;
    }
    public int getPhysic () {
    	return physic;
    }
    public int getChemistry () {
    	return chemistry;
    }
    public int getMath () {
    	return math;
    }
    public double getAverage () {
        return average;
    }
}