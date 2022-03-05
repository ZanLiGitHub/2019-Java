/*==================================
Foundations of Computer Science
Student: ZanLi
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 5
===================================*/

class Student{
	private String name;
	private int age;
	private int period;
    
    //accessors and mutators
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }
    public void setAge(int age){
    	this.age = age;
    }
    public int getAge(){
    	return age;
    }
    public void setPeriod(int period){
    	this.period = period;
    }
    public int getPeriod(){
    	return period;
    }


    // Constructors, set everything to 0 or "unknown"
	public Student(){
		this.name = "unknow";
		this.age = 0;
		this.period = 0;
	}
	// Special Constructor
	public Student(String tmpName, int tmpAge, int tmpPeriod){
		this.name = tmpName;
		this.age = tmpAge;
		this.period = tmpPeriod;
	}
}