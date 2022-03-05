import java.util.*;
public class problem01{
	public static void main(String[]args){
		Random ran=new Random();
		int a=0;
		while(a<=10){
			int b=ran.nextInt(20);
			System.out.print("Number ("+b+"): ");
			for (int c=1;c<=b;++c){
				System.out.print("*");
			}
			System.out.println();
		a++;
		}
	}
}