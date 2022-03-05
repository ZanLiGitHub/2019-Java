import java.util.*;
public class analysis{
    public static void main(String[]args){
        long sum=0;
        float average=(float)0.0f;
        Random ran=new Random();
        for(int number=1;number<=10;number++){
            int b=ran.nextInt(100);
            System.out.println("The random number is "+b);
            sum+=b;
            average=(float)sum/number;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);
    }
}