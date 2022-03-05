//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class Main{
	/**
    * Sets arrays for testing. Print array1, sum array1 and array2, sum array1 and array2 for testing the exception, reverse array1.
    */
	public static void main (String[]args){
		double[] array1 = new double[3];
		array1[0] = 1.0d;
		array1[1] = 2.0d;
		array1[2] = 3.0d;
		double[] array2 = new double[3];
		array2[0] = 1.1d;
		array2[1] = 2.2d;
		array2[2] = 3.3d;
		double[] array3 = new double[4];
		array3[0] = 1.0d;
		array3[1] = 2.0d;
		array3[2] = 3.0d;
		array3[3] = 4.0d;
		
        HandlingArrays method = new HandlingArrays();
		method.printArray(array1);
		method.sumElements(array1, array2);
		method.sumElements(array1, array3);
        method.reverseArray(array1);
	}
}