//problem-01/BasicProgram.java
import java.lang.*;
import java.util.*;

public class BasicProgram{    
    public int sum(int a, int b){
    	return a+b;
    }
    public double div(int a, int b){
    	if(b == 0)
    		throw new UnsupportedOperationException("Not possible division by zero.​");
    	return (double)a/b;
    	
    }
    public void displayArray(int []array){
    	System.out.print(Arrays.toString(array));
        System.out.println(";");
    }
}