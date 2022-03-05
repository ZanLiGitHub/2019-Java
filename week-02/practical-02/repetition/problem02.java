import java.lang.*;
import java.util.*;
public class problem02{
	public static void main(String[]args){
		Random ran=new Random();
		int sum=0;
		for(int i=1;i<=10;i++){
			int number=ran.nextInt(20);
			int j=1,k=1;
			System.out.print("Number ("+number+"):");
			sum+=number;
			while(j<=number){
				System.out.print("*");
			j++;
			}
			System.out.println();
			if(i==10){
				System.out.print(sum);
				double ave=(double)sum/i;
				long round_ave=Math.round(ave);
				System.out.print("Average("+round_ave +"):");
				while(k<=round_ave){
					System.out.print("*");
					k++;
				}
				System.out.print();
			}
		}
	}
}