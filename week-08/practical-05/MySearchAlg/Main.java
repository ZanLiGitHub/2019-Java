import java.util.*;

public class Main {
    public static void main (String[] args) {
 		
		int[] array1 = {1,3,5,7,9};
		int[] array2 = {1,5,8,12,9,7,-1};

 		int ans1 = 1;
		int ans2 = 3;
		int ans3 = 6;
		int result1 = giveLinearResult (array1, ans1);
		int result2 = giveBinaryResult (array1, ans2);
		int result3 = giveBinaryResult (array1, ans3);

		System.out.println("The ans1 is "+ans1+", the result of this test is "+test(result1, ans1)+".");
		System.out.println("The ans2 is "+ans2+", the result of this test is "+test(result2, ans2)+".");
		System.out.println("The ans2 is "+ans3+", the result of this test is "+test(result3, ans3)+".");
        System.out.println("The index value for the maximum number in "+Arrays.toString(array2)+" is "+findMaxVal (array2));

	}
    
    /**
    * Test if an array has the number which the user is looking for(ans). True means found, false means not found.
    *
    * @param int result, int ans
    */
	private static boolean test (int result, int ans) {
		if (result == ans)
			return true;
		return false;
	}
    
    /**
    * Uses linear search to find a number
    */
	private static int giveLinearResult (int[] array, int ans) {
		LinearSearch l = new LinearSearch();
		int result = 0;
		int lr = l.search(array, ans);
		if (lr == -1)
			return result = -1;
		return result = array[l.search(array, ans)];
	}
    
    /**
    * Uses binary search to find a number
    */
	private static int giveBinaryResult (int[] array, int ans) {
		BinarySearch b = new BinarySearch();
		int result = 0;
		int br = b.search(array, ans);
		if (br == -1)
			return result = -1;
		return result = array[b.search(array, ans)];
	}
   
    /**
    * A wrapper over recursive function findMax()
    */
	private static int findMaxVal (int[] array) {
		
    	return findMax (array, 0, array.length);
    }

	
	/**
	* Use binary search to find the max number of an array. If both array[x-1] and array[x+1] are smaller than 
	* array[x], then x is the max number's index.
	*
	* @return int max
	* @param int[] array, int lower, int upper.
	*/
    private static int findMax (int[] array, int lower, int upper) {

		int max = 0;

		if (upper >= lower){
            int mid = (lower + upper)/2;

        	if ((mid == 0 || array[mid-1] <= array[mid]) && (mid == upper-1 || array[mid+1] <= array[mid]))
            	max = mid;
 
    		else if (mid > 0 && array[mid-1] > array[mid])
        		max = findMax(array, lower, (mid-1));
 
            else  
            	max = findMax(array, (mid + 1), upper);
        }

        return max;     
    }
}    