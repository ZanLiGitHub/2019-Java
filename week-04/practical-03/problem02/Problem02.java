import java.util.*;
/**
* Develops several classes for different uses. For each class, accessors and mutators are developed.
* a1750906/2019/s1/fcs/week-04/practical-03.
*
* @author Zan Li
* @time 04/04/2019
*/

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor and methods. 
* Student has double[] marks and String[] disciplines.
* This class provides methods of calculating averageMarks and displayDisciplines.
*/
class Student extends Person{
	protected double[] marks;
	protected String[] disciplines;
	public Student(){}
	public Student(double[] marks, String[] disciplines){
		this.marks = marks;
		this.disciplines = disciplines;
	}
	public void setmarks(double[] marks){
		this.marks = marks;
	}
	public void setdisciplines(String[] disciplines){
		this.disciplines = disciplines;
	}
	public double[] getmarks(){
		return marks;
    }
    public String[] getdisciplines(){
		return disciplines;
	}
	
	public double averageMarks(double[] marks){
		double sum = 0.0d;
		double averageMarks = 0.0d;
		for(int i=0; i<marks.length; i++){
			sum += marks[i];
		}
		averageMarks = sum/marks.length;
		return averageMarks;
	}
	
	public void displayDisciplines(String[] disciplines){
		System.out.println(Arrays.toString(disciplines));
	}
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor and methods. 
* Lecturer has double[] salary and String[] disciplines.
* This class provides methods of calculating annualsalary and displayDisciplines.
*/
class Lecturer extends Person{
	protected double[] salary;
	protected String[] disciplines;
	public Lecturer(){}
	public Lecturer(double[] salary, String[] disciplines){
		this.salary = salary;
		this.disciplines = disciplines;
	}
	public void setsalary(double[] salary){
		this.salary = salary;
	}
	public void setdisciplines(String[] disciplines){
		this.disciplines = disciplines;
	}
	public double[] getsalary(){
		return salary;
    }
    public String[] getdisciplines(){
		return disciplines;
	}
	
	public double annualsalary(double[] salary){
		double annualsalary = 0.0d;
		for(int i=0; i<salary.length; i++){
			annualsalary += salary[i];
		}
		return annualsalary;
	}
	
	public void displayDisciplines(String[] disciplines){
		System.out.println(Arrays.toString(disciplines));
	}
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* Doctor has String speciality.
*/
class Doctor extends Person{
	protected String speciality;
	public Doctor(){}
	public Doctor(String speciality){
		this.speciality = speciality;
	}
	public void setspeciality(String speciality){
		this.speciality = speciality;
	}
	public String getspeciality(){
		return speciality;
    }
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* Patient has String diagnostic.
*/
class Patient extends Person{
	protected String diagnostic;
	protected String inTime;
	protected String prevTime;
	public Patient(){}
	public Patient(String diagnostic, String inTime, String prevTime){
		this.diagnostic = diagnostic;
		this.inTime = inTime;
		this.prevTime = prevTime;
	}
	public void setdiagnostic(String diagnostic){
		this.diagnostic = diagnostic;
	}
	public String getdiagnostic(){
		return diagnostic;
    }
	public void setinTime(String inTime){
		this.inTime = inTime;
	}
	public String getinTime(){
		return inTime;
    }
	public void setprevTime(String prevTime){
		this.prevTime = prevTime;
	}
	public String getprevTime(){
		return prevTime;
    }
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* Ebook has String url.
*/
class Ebook extends Book{
	protected String url;
	public Ebook(){}
	public Ebook(String url){
		this.url = url;
	}
	public void seturl(String url){
		this.url = url;
	}
	public String geturl(){
		return url;
    }
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* PhysicalBook has int shelf, int aisle, int floor.
*/
class PhysicalBook extends Book{
	protected int shelf;
	protected int aisle;
	protected int floor;
	public PhysicalBook(){}
	public PhysicalBook(int shelf, int aisle, int floor){
		this.shelf = shelf;
		this.aisle = aisle;
		this.floor = floor;
	}
	public void setshelf(int shelf){
		this.shelf = shelf;
	}
	public int getshelf(){
		return shelf;
    }
		public void setaisle(int aisle){
		this.aisle = aisle;
	}
	public int getaisle(){
		return aisle;
    }
		public void setfloor(int floor){
		this.floor = floor;
	}
	public int getfloor(){
		return floor;
    }
	public void displayBookLocation(int shelf, int aisle, int floor){
		System.out.println("floor"+shelf+",aisle"+aisle+",floor"+floor+".");
	}
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* Lion can makeSound.
*/
class Lion extends Animal{
	public Lion(){}
	public void makeSound(){
	}
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* Turtle can makeSound.
*/
class Turtle extends Animal{
	public Turtle(){}
	public void makeSound(){
	}
}

/**
* This class implements Accessors, Mutators, Basic Constructor, Parametric Constructor. 
* Chameleon can makeSound.
*/
class Chameleon extends Animal{
	public Chameleon(){}
	public void makeSound(){
	}
}