import java.util.*;
import java.lang.*;
public class problem05{
	public static void main(String[]args){
		Random ran=new Random();
		int number=1,sum=0;
        int a=0;
        while(number<=10){
        	int p=ran.nextInt(20);

        	switch(p){
        		case 0:
        		a=0;
        		break;
        		case 1:
        		case 2:
        		case 3:
        		case 4:
        		case 5:
        		a=1;
        		break;
        		case 6:
        		case 7:
        		case 8:
        		case 9:
        		case 10:
        		a=2;
        		break;
        		case 11:
        		case 12:
        		case 13:
        		case 14:
        		case 15:
        		a=3;
        		break;
        		default:
        		a=4;
        		break;
        	}
        	if (a==0){
        		--number;
        	}
        	if (a==1){
        		System.out.print("o");
        	}
        	if (a==2){
        		System.out.print("x");
        	}
        	if (a==3){
        		System.out.print("s");
        	}
        	if (a==4){
        		System.out.print("*");
        	}
        	++number;
        }
        System.out.println();
    }
}