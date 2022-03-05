import java.util.Scanner;

/**
* Asks for user input of a number, and then check whether the number is prime or not.
* a1750906/2019/s1/fcs/week-03/practical-03/problem02.
*
* @auther Zan Li
* @Time 29/03/2019
*/
public class PrimeNumber{
	public static void main(String[]args){
		System.out.println(caculating(input()));
	}

    /**
    * Asks for user input of a number, and check whether the number is an interger.
    * This method can normalize the user's input value to an integer.	
    * 
    * @return An integer waiting to be checked
    */
	public static int input(){
		System.out.print("Please insert a number: ");
		Scanner input= new Scanner(System.in);

		while(!input.hasNextInt()){
    	    System.out.print("Please insert an interger: ");
    	    input.next();
    	}
		int number = input.nextInt();
		return number;
	}

    /**
    * Checks whether the number is prime or not.
    *
    * @param An integer waiting to be checked
    * @return The result which indicates whether the input integer is a prime number
    */
	public static String caculating (int number){
		if (number<2){
			return "Your number is not prime";
		}
		for (int i=2; i<number; i++){
			if(number%i==0){
				return "Your number is not prime";
			}
		}
		return "Your number is prime";
	}  
}