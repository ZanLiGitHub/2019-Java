import java.util.*;
import java.lang.*;
public class problem04{
	public static void main(String[]args){
		Random ran=new Random();
		int number=1,sum=0;
		while(number<=10){
			int p = ran.nextInt(20);
			sum+=p;
			System.out.print("Number ("+p+"):");
			if(p>=10){
				for(int a=1;a<=p;++a){
					System.out.print(">=");
				}
			}
			else{
				for(int b=1;b<=p;++b){
					System.out.println("<");
				}
			}
			System.out.println();
			++ number;
		}
		double average=(double)sum/(number-1);
		long b=Math.round(average);
		System.out.print("Average ("+b+"):");
		for(int c=1;c<=average;++c){
			System.out.print("*");
		}
		System.out.println();
	}
}