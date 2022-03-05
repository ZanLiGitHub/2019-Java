//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class Caculator{

	/**
	* Sums two varibles
	* 
	* @param numA and numB
	* @return the sum of sumA and sumB
	*/
	public int sum(int numA, int numB){
        int sum = numA + numB;
        return sum;
	}
    
    /**
	* Substracts two varibles
	* 
	* @param numA and numB
	* @return the sub of sumA and sumB
	*/
	public int sub(int numA, int numB){
		int sub = numA - numB;
		return sub;
	}
    
    /**
	* Multiples two varibles. 
	* 
	* @param numA and numB
	* @return the muiltiply of sumA and sumB
	*/
	public float multiply(float numA, float numB){
		float multiply = numA * numB;
		return multiply;
	}
    
    /**
	* Divides two varibles. If division by 0, the result should be -99.0
	* 
	* @param numA and numB
	* @return the division of sumA and sumB
	*/
	public float division(float numA, float numB){
		float division = 0.0f;
		if(numB == 0.0f){division = -99.0f;
		}else{division = numA * numB;
		}
		return division;
	}
}