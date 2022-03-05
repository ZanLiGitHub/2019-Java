/**
* Performs arithmetic operations of complex numbers. Read the numbers insered by user, then caculates them seperatedly. 
* Since math operations of complex numbers are different, addition operation: (a+bi)+(c+di)=(a+c)+(b+d)i.
* Substraction operation: (a+bi)-(c+di)=(a-c)+(b-d)i.
* Multiplication operation: (a+bi)*(c+di)=((a*c)-(b*d))+((b*c)+(a*d))i.
* Division operation: (a+bi)/(c+di)=(a*c+b*d/(c*c+d*d))+(b*c+a*d/(c*c+d*d)).
* a1750906/2019/s1/fcs/week-03/practical-03/problem04.
*
* @author Zan Li
* @Time 29/03/2019
*/
import java.util.Scanner;
public class ComplexCalculator{
    public static void main(String[]args){
        Double[] cns = {4.5d,3d,2d,1.5d};
        addC(cns);
        subC(cns);
        multiC(cns);
        diviC(cns);  
	}

    /**
    * addition operation: (a+bi)+(c+di)=(a+c)+(b+d)i. 
    * The number 0 of this array is the first complex number's real part.
    * The number 1 of this array is the first complex number's imaginary part.
    * The number 2 of this array is the second complex number's real part.
    * The number 3 of this array is the secomd complex number's imaginary part.
    * 
    * @param The Double array which is seted by the method setC
    */
    public static void addC(Double[] cns){
        double addReal = cns[0]+cns[2];
        double addImaginary = cns[1]+cns[3];
        System.out.println("The addition of the two complex numbers is: "+addReal+"+"+addImaginary+"i");
    }
    
    /**
    * Substraction operation: (a+bi)-(c+di)=(a-c)+(b-d)i.
    * The number 0 of this array is the first complex number's real part.
    * The number 1 of this array is the first complex number's imaginary part.
    * The number 2 of this array is the second complex number's real part.
    * The number 3 of this array is the secomd complex number's imaginary part.
    * 
    * @param The Double array which is seted by the method setC
    */
    public static void subC(Double[] cns){
        double subReal = cns[0]-cns[2];
        double subImaginary = cns[1]-cns[3];
        System.out.println("The subtraction of the two complex numbers is: "+subReal+"+"+subImaginary+"i");
    }
    
    /**
    * Multiplication operation: (a+bi)*(c+di)=((a*c)-(b*d))+((b*c)+(a*d))i.
    * The number 0 of this array is the first complex number's real part.
    * The number 1 of this array is the first complex number's imaginary part.
    * The number 2 of this array is the second complex number's real part.
    * The number 3 of this array is the secomd complex number's imaginary part.
    * 
    * @param The Double array which is seted by the method setC
    */
    public static void multiC(Double[] cns){
        double multiReal = cns[0]*cns[2]-cns[1]*cns[3];
        double multiImaginary = cns[1]*cns[2]+cns[0]*cns[3];
        System.out.println("The multiplication of the two complex numbers is: "+multiReal+"+"+multiImaginary+"i");
    }
    
    /**
    * Division operation: (a+bi)/(c+di)=(a*c+b*d/(c*c+d*d))+(b*c+a*d/(c*c+d*d)).
    * The number 0 of this array is the first complex number's real part.
    * The number 1 of this array is the first complex number's imaginary part.
    * The number 2 of this array is the second complex number's real part.
    * The number 3 of this array is the secomd complex number's imaginary part.
    * 
    * @param The Double array which is seted by the method setC
    */
    public static void diviC(Double[] cns){
        double diviReal = (cns[0]*cns[2]+cns[1]*cns[3])/cns[2]*cns[2]+cns[3]*cns[3];
        double diviImaginary = (cns[1]*cns[2]+cns[0]*cns[3])/cns[2]*cns[2]+cns[3]*cns[3];
        System.out.println("The division of the two complex numbers is: "+diviReal+"+"+diviImaginary+"i");
    }
}