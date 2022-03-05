/*
*   Foundations of Computer Science
*   2019, Semester 01
*   Practical-Exam-04
*
*   student (id): a1750906
*   student (name): ZanLi
*
*
* Note: your are required to perform small changes, as accessors and mutators;
*
*/
public abstract class Person{
	protected String name;
	protected int age;
	
	Person(){
		this.name = "unnamed";
		this.age = 0;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	/* implement accessors and mutators */
}