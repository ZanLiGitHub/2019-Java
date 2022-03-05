import java.util.Scanner;

/**
* Asks two number for user. Reads the number and to display 
* the largest value between.
* a1750906/2019/s1/fcs/week-03/practical-03/problem03.
*
* @author Zan Li
* @Time 29/03/2019
*/
public class Comparison{
	public static void main(String[] args){
		System.out.println(comparison(input()));
   
	}

	/**
	* Asks two numbers for user, check wheather the inserted numbers are double type. 
	* 
	* @return inserted numbers into an array
	*/
	public static Double[] input(){
		Double[] numbers = new Double[2];
		Scanner input= new Scanner(System.in);
		System.out.print("Please, insert a number (1): ");
		while(!input.hasNextDouble()){
    	    System.out.print("Please insert a number (1): ");
    	    input.next();
    	}
		Double number1 = input.nextDouble();
		numbers[0]=number1;
		System.out.print("Please, insert a number (1): ");
		while(!input.hasNextDouble()){
    	    System.out.print("Please insert an number (1): ");
    	    input.next();
    	}
		Double number2 = input.nextDouble();
		numbers[1]=number2;
		return numbers;
	}

	/**
	* Compare the numbers in an array, and then return the result.
	*
	* @param The array which contains the inserted numbers
	* @return Result which indicates which is the bigger one
	*/
	public static String comparison(Double[] numbers){
		if(numbers[0]>numbers[1]){
			return "The bigger number is "+numbers[0];
		}
		else if(numbers[0]==numbers[1]){
			return "These numbers are equal";
		}
		else{
			return "The bigger number is "+numbers[1];
		}
	}
}