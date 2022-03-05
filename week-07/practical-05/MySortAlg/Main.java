//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================

import java.util.*;

public class Main{
	

	public static void main (String[] args){
		
		MergeSort mSort = new MergeSort();
		QuickSort qSort = new QuickSort();
        

		int[] array = {4,1,2,5,3};
		int[] result1 = qSort.sort(array);
		int[] result2 = mSort.sort(array);
        int[] ans = {5,4,3,2,1};
        System.out.println(test(result1, ans));
        System.out.println(test(result2, ans));


        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,4,5,6,3};
        System.out.println(compare(array1, array2));


        int[] array3 = {5,6,7,8,9,10};
        int sum = findSmallestSum (array3);
        System.out.println("The smallest sum of array "+Arrays.toString(array3)+" is "+sum);

	}


	public static boolean test (int[] result, int[] ans){
 		if(Arrays.equals(result, ans)){
            return true;
        }
        return false;
	}


	public static boolean compare (int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) {
            return true;
        } else {
            return false;
        }
    }


    public static int findSmallestSum (int[] array){
    	int sum;
    	QuickSort qSort = new QuickSort();
    	qSort.sort(array);
    	sum = array[array.length-1]+array[array.length-2];
    	return sum;
    }
}