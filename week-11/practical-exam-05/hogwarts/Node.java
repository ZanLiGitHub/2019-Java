/*==================================
Foundations of Computer Science
Student: ZanLi
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 5
===================================*/

class Node{
	private Student info;
	private Node next;
    
    //accessors and mutator
	public void setInfo(Student info){
		this.info = info;
	}
	public Student getInfo(){
		return info;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return next;
	}
    
    //Basic and Special Constructor
	public Node(){
		this.info = null;
		this.next = null;
	}
	public Node(Student info){
		this.info = info;
	}
	public Node(Student info, Node next){
		this.info = info;
		this.next = next;
	}	
} 