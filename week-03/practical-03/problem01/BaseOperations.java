/**
* Performs the printing of a given array, and then changes the order of the elements of a given 
* array in reverse order.
* a1750906/2019/s1/fcs/week-03/practical-03/problem01.
*
* @auther Zan Li
* @Time 29/03/2019
*/ 	
import java.util.Arrays;
public class BaseOperations{
	public static void main(String[]args){
	    int[] arrayi = {1,2,3};
	    printArray (arrayi);
        reverseArray (arrayi);
        printArray(arrayi);
        String[] arrays = {"Hello","World"};
        printArray (arrays);
        reverseArray (arrays);
        printArray(arrays);
        float[] arrayf = {1.1f,2.2f,3.3f};
        printArray (arrayf);
        reverseArray (arrayf);
        printArray(arrayf);
	}
    
    /**
    * Performs the printing of a given array.
    *
    * @param an int array
	*/
	public static void printArray(int[] array){
		System.out.println(Arrays.toString(array));
	}

    /**
    * Performs the printing of a given array.
    *
    * @param an String array
    */
	public static void printArray(String[] array){
	    System.out.println(Arrays.toString(array));
	}

    /**
    * Performs the printing of a given array.
    *
    * @param an float array
    */
    public static void printArray(float[] array){
		System.out.println(Arrays.toString(array));
    }

    /**
    * Reverses a given array by exchange order of the first element and the last element.  
    *
    * @param an int array waiting to be reversed
    * @return an reversed int array
    */
    public static int[] reverseArray(int[] array){
        int temp;
        int len = array.length;
        for(int a = 0 ; a < len/2; a++){
    	    temp = array[len - a - 1];
    	    array[len - a - 1] = array[a];
    	    array[a]=temp;
        }
        return array;
    }

    /**
    * Reverses a given array by exchange order of the first element and the last element.  
    *
    * @param an String array waiting to be reversed
    * @return an reversed String array
    */
    public static String[] reverseArray(String[] array){
        String temp;
        int len = array.length;
        for(int a = 0 ; a < len/2; a++){
    	    temp = array[len - a - 1];
    	    array[len - a - 1] = array[a];
    	    array[a]=temp;
        }
        return array;
    }

    /**
    * Reverses a given array by exchange order of the first element and the last element.  
    *
    * @param an float array waiting to be reversed
    * @return an reversed float array
    */
    public static float[] reverseArray(float[] array){
        float temp;
        int len = array.length;        
        for(int a = 0;a < len/2; a++){
    	    temp = array[len - a - 1];
    	    array[len - a - 1] = array[a];
    	    array[a]=temp;
        }
        return array;
	}
}