/**
* This class implements Accessors, Mutators, Basic Constructor and Parametric Constructor. 
* Book has title, year, publish and pages.
*/
public class Book{
	protected String title;
	protected int year;
	protected String publish;
	protected int pages;
	public Book(){}
	public Book(String title, int year, String publish, int pages){
		this.title = title;
		this.year = year;
		this.publish = publish;
		this.pages = pages;
	}
	public void settitle(String title){
		this.title = title;
	}
	public String gettitle(){
		return title;
	}
	public void setyear(int year){
		this.year = year;
	}
	public int getyear(){
		return year;
	}
	public void setpublish(String publish){
		this.publish = publish;
	}
	public String getpublish(){
		return publish;
	}
	public void setpages(int pages){
		this.pages = pages;
	}
	public int getpages(){
		return pages;
    }
}	