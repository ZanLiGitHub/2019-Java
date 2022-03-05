/*==================================
Foundations of Computer Science
Student: ZanLi
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 5
===================================*/

class Queue{

    Node back = null;
    
    // Basic constructor 
    public Queue(){
    	this.back = null;
    }
    
    /**
    * Add a node before back
    * 
    * @param a Student tmpStudent
    **/
    public void enqueue(Student tmpStudent){
		Node student = new Node(tmpStudent);
		if(this.back != null ){
			student.setNext(this.back);
			this.back = student;

		} else{
			this.back = student;
		}
	}
    
    /**
    * Delete a node before back
    * 
    * @param a node
    **/
	public void dequeue(){
		if(this.back != null){
			if(this.back.getNext() != null){
				Node tmp = this.back;
				Node prev = null;
				while(tmp.getNext() != null){
					prev = tmp;
					tmp = tmp.getNext();
				}
				prev.setNext(null);

			} else{
				this.back = null;
			}

		}
	}

	/**
	* Print all students' information
	*/
	public void displayQueue(){
		if(this.back != null){
			Node tmp = this.back;
			int i = 1;
			do{ 
				//Ues if else to decied 1st, 2nd and 3rd.
			    if(tmp.getInfo().getPeriod()==1){ 
				    System.out.println("#"+i+" "+tmp.getInfo().getName()+", "+tmp.getInfo().getAge()+" years old, "+tmp.getInfo().getPeriod()+"st year in Hogwarts;");
				    tmp = tmp.getNext();
				    i++;
				}else if(tmp.getInfo().getPeriod()==2){
					System.out.println("#"+i+" "+tmp.getInfo().getName()+", "+tmp.getInfo().getAge()+" years old, "+tmp.getInfo().getPeriod()+"nd year in Hogwarts;");
				    tmp = tmp.getNext();
				    i++;
				}else if(tmp.getInfo().getPeriod()==3){
					System.out.println("#"+i+" "+tmp.getInfo().getName()+", "+tmp.getInfo().getAge()+" years old, "+tmp.getInfo().getPeriod()+"rd year in Hogwarts;");
				    tmp = tmp.getNext();
				    i++;
				}
			}while(tmp != null);
		}
		System.out.println();
	}
}