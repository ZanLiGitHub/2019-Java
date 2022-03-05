import java.util.Scanner;
public class part3{
	public static void main(String[]args){
		System.out.println("Welcome dear user !");
		System.out.println("Would you like to: ");
		System.out.println("a) sum again");
		System.out.println("b) exit");
		System.out.print("Option :");
		int sum=0;
		Scanner input=new Scanner(System.in);
		String option=input.next();
		while(option.equals("a")){
			System.out.print("Please, insert the first numbr :");
			int first=input.nextInt();
			System.out.print("Please, insert the second number :");
			int second=input.nextInt();
			sum=first+second;
			System.out.println("----");
			System.out.println("Thank you forenquiry, the um between "+first+" and "+second+" is "+sum);
			System.out.println("Would you like to: ");
			System.out.println("a) sum again");
			System.out.println("b) exit");
			System.out.print("Option :");
			option = input.next();
		}
		if(option.equals("b")){
			System.out.println("Thank you ! Have a good day.");
		}
	}
}