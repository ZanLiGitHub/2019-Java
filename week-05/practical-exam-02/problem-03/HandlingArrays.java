//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class HandlingArrays {
    
    /**
    * Define and implement the printArray, for a given array.
    * 
    * @param a double array
    */
    public static void printArray(double [] testArray) {
        int len = testArray.length; 
    	for(int i=0;i<len;i++){
    		System.out.print(testArray[i]+" ");
    	}
    	System.out.println(""); 
    }

    /**
    * Define and implement sumElements, which sum element-wise two arrays.
    * java.lang.RuntimeException is used. Given two arrays of different size, the output of 
    * sumElements should be:Error - Arrays different shape.
    *
    * @param two double arrays
    * @return a sum double srray
    */
    public static double[] sumElements(double [] firstArray, double [] secondArray) {
        double[] sumElements = new double[firstArray.length];
        if(firstArray.length != secondArray.length){
    		throw new RuntimeException("Error - Arrays different shape");
        }
        else{
            for(int i=0;i<firstArray.length;i++){
            	sumElements[i]=firstArray[i]+secondArray[i];
            }   
        }
        return sumElements;
    }

    /**
    * Reverses a given array.
    * 
    * @param a double array
    * @return a reversed double array
    */
    public static double[] reverseArray(double [] testArray) {
        double[] reverseArray = new double[testArray.length]; 
        for(int i=testArray.length;i>0;i--){
        	reverseArray[i] = testArray[i];
        }
        return reverseArray;
    }
}