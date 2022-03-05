// //==================================
// // Foundations of Computer Science
// // Student: Zan Li
// // id: your a1750906
// // Semester: 1
// // Year: 2019
// // Practical Exam Number: 01
// //===================================
public class Problem{
	public static void main(String[]args){
		System.out.println("This is the last line of the code!");
        int ths = 25;
        int value = i * j * k;
        for(int i = 0; i < 10; i++){
        	for(int j = i; j < 10; j++){
        		if(value % ths == 0 ){
        			for (int k = j; k < 10; k ++){
        				if(value != 0){
        					System.out.print(" j: " + j);
                            System.out.print("i: " + i);
                            System.out.println(" k: " + k + " - value " + value);
        				}
        			}
        		}
        	}
        }
        System.out.println("This is the first line of the code!");
	}
}