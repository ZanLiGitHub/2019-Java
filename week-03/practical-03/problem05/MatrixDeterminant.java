import java.util.Scanner;

/**
* Define a multi-dimensional array and perform a matrix determinant operation.
* Set the matrix (must be square). Reduce this matrix to row echelon form using elementary
* row operations so that all the elements below diagonal are zero. Multiply the main 
* diagonal elements of the matrix - determinant is calculated.
* Due to the complexity of this operation, user can only set matrices 2x2 and 3x3.
* a1750906/2019/s1/fcs/week-03/practical-03/problem05.
*
* @author Zan Li
* @Time 29/03/2019
*/
public class MatrixDeterminant{
	public static void main(String[]args){
        calculate(matrix(welcome()));
         


        
	}

	/**
	* Asks user wether use this program. Enter 1 for use, and 2 for exit. This method can 
	* check wether the inserted number is 1 or 2. 
	* 
	* @return a string 1 or 2
	*/
	public static String welcome(){
		System.out.print("\nWelcome to Matrix Determinant Calculator! \nWould you like to calculate the determinant of a new matrix? \n1. Yes, 2. No \n\nOption: ");
		Scanner input = new Scanner(System.in);
    	String option = "";
    	boolean loop = true;
    	while(loop){
    	    System.out.print("Please insert 1 or 2: ");
    	    option = input.next(); 
    	    if (option.equals("1")){
	            option = "1";
	            loop=false;
			}else if (option.equals("2")){
				System.out.println("Goodbye");
				loop=false;
			}else{
				loop=true;
			}
    	}
    	return option;	
	}

	/**
	* Set the matrix (must be square). There are only two choices, 3x3 matrix and 2x2 
	* matrix.This method can check wether the insert string is 3x3 or 2x2. Then, use 
	* for loop to set numbers into matrix. Finally, this method uses for to print the 
	* formed matrix with "|" and numbers. 
	*
	* @param the option, 1 represent continue, 2 represent exit.
	* @return a two-dimensional doube array.
	*/
	public static double[][] matrix(String option){
    	double[][] matrix = new double [0][0];
    	if (option.equals("1")){
    		System.out.print("What is the dimension of the matrix? \nInput: ");
	    	Scanner input = new Scanner(System.in);
	    	String determension = "";
	    	boolean loop = true;
	    	while(loop){
		    	determension = input.next();
		    	if(determension.equals("3x3")){
		    		matrix = new double[3][3];
		    		loop = false;
		    	}else if(determension.equals("2x2")){
		    		matrix = new double[2][2];
		    		loop = false;
		    	}else{
		    		System.out.print("Please insert 3x3 or 2x2: ");
		    		loop = true;
		    	}
	    	}
        }
        else{
        	System.out.print("");
        }
        System.out.print("Great! Let's calculate this determinant then. \nPlease insert all the values for your matrix. \n");
	    Scanner input = new Scanner(System.in);
	    for(int i=0; i<matrix.length; i++){
	    	for(int j=0; j<matrix[0].length; j++){
	    		System.out.print("New matrix ["+(i+1)+"]["+(j+1)+"]: ");
	    		matrix[i][j]=input.nextDouble();
	    	}
        }
        int size = matrix.length;
        System.out.println("The determinant of your matrix is: ");
		for (int i=0;i<size;i++){
			for (int j=0;j<size;j++){
				if (j==0){
					System.out.print("| ");
				}
				System.out.print(" "+(int)matrix[i][j]+" ");
				if (j==size-1){
					System.out.println(" |");
				}
			}
		}			
        return matrix; 
	}

    /**
    * Calculates the two-dimensional array by using elementary row operations. 
    * Reduce this matrix to row echelon form using elementary row operations so 
    * that all the elements below diagonal are zero. Then, multiply the main 
    * diagonal elements of the matrix - determinant is calculated. Adetermines 
    * the number is positive or negative. Finally, print the determinant.
    *
    * @param a two-dimensional doube array which is seted by method martix
    */
	public static void calculate(double[][] matrix){
		double determinant=1d,a=1d;
		int size = matrix.length;
		for (int i=0;i<size-1;i++){
			for (int j=size-1;j>i;j--){
				if (matrix[j][size-1-i]*matrix[i][size-1-i]!=0){
				    a=a*matrix[j][size-1-i]/matrix[i][size-1-i];
				}
				for (int k=0;k<size;k++){
					if (matrix[j][size-1-i]!=0){
					matrix[j][k]=matrix[j][k]/matrix[j][size-1-i]*matrix[i][size-1-i]-matrix[i][k];
					}
				}
			}
		}
		if (size%4==1 || size%4==0){
			determinant=a;
		}else{
			determinant=-a;
		}
		for (int i=size-1;i>=0;i--){
			determinant=determinant*matrix[i][size-1-i];
		}
		System.out.println("Determinant: "+determinant);	
	}
}

	
	

	   
	   