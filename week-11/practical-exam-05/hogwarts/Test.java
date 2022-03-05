/*==================================
Foundations of Computer Science
Student: ZanLi
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 5
===================================*/

class Test{
    public static void main(String[] args){
	    
	    // 1. Set up Queue
		Queue howgarts = new Queue();
	    howgarts.enqueue(new Student("Cedric Diggory", 14, 1));
	    howgarts.enqueue(new Student("Harry Potter", 14, 1));
	    howgarts.enqueue(new Student("Hermione Granger", 12,1));
	    howgarts.enqueue(new Student("Ron Weasley", 15, 1));
	    howgarts.enqueue(new Student("Fred Weasley", 16, 3));
	    howgarts.enqueue(new Student("George Weasley", 16, 3));

	    // 2. Set up the behaviors
	    howgarts.dequeue();
	    howgarts.dequeue();
	    howgarts.enqueue(new Student("Draco Malfoy", 15, 2));

	    // 3. Display Queue
	    howgarts.displayQueue();
	}
}