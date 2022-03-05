import java.util.*;
public class Main{
	public static void main(String[]args){
		int number_20=0,number_50=0;
		Scanner input =new Scanner(System.in);
		System.out.print("Please input nmbers: ");
		int money=input.nextInt();
		run(money);
	}
	public static void run (int k){
		boolean m=true;
		int a= k/50;
		while(m && a>=0){
			if((k-50*a)%20==0){
				m=false;
				System.out.println("Here is "+(k-50*a)/20+" $20 notes and"+a+" $50 notes.");
			}
			a--;
		}
		if(m){
			System.out.println("Sorry, th money can not be withdraw.");
		}
	}
}