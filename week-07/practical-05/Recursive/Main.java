//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input an interger：");
        int num=scanner.nextInt();
        System.out.println("The next happy number is "+nextHappy(num));

        System.out.println(decodeString("5[a3[b1[c]]]"));
    }
    
    public static int nextHappy (int num) {
        boolean b = true;
        while(b){
            num++;
            boolean h = isHappy(num);
            if (h == true){
                break;
            }else {
                b = true;
            }
        }

        return num;
    }


    public static boolean isHappy(int num){
       Integer temp=num;
       while(true){
           temp=numberNext(temp);

           if(temp==1){
               return true;
           }else if(temp==89){
               return false;
           }
       }
    }

    public static int numberNext(int num){
        Integer result=0;
        while(num>0){
            result+=(num%10)*(num%10);
            num/=10;
        }
        return result;
    }
    

    public static String decodeString(String str) { 
        Stack<Integer> integerstack = new Stack<>(); 
        Stack<Character> stringstack = new Stack<>(); 

        String temp = "", result = ""; 
       
        for (int i = 0; i < str.length(); i++) 
        { 
            int count = 0; 
       
            if (Character.isDigit(str.charAt(i))) 
            { 
                while (Character.isDigit(str.charAt(i))) 
                { 
                    count = count * 10 + str.charAt(i) - '0'; 
                    i++; 
                } 
       
                i--; 
                integerstack.push(count); 
            } 
       
            else if (str.charAt(i) == ']') 
            { 
                temp = ""; 
                count = 0; 
       
                if (!integerstack.isEmpty()) 
                { 
                    count = integerstack.peek(); 
                    integerstack.pop(); 
                } 
       
                while (!stringstack.isEmpty() && stringstack.peek()!='[' ) 
                { 
                    temp = stringstack.peek() + temp; 
                    stringstack.pop(); 
                } 
       
                if (!stringstack.empty() && stringstack.peek() == '[') 
                    stringstack.pop(); 
       

                for (int j = 0; j < count; j++) 
                    result = result + temp; 
       

                for (int j = 0; j < result.length(); j++) 
                    stringstack.push(result.charAt(j)); 
       
                result = ""; 
            } 

            else if (str.charAt(i) == '[') 
            { 
                if (Character.isDigit(str.charAt(i-1))) 
                    stringstack.push(str.charAt(i)); 
       
                else
                { 
                    stringstack.push(str.charAt(i)); 
                    integerstack.push(1); 
                } 
            } 
       
            else
                stringstack.push(str.charAt(i)); 
        } 
       
        while (!stringstack.isEmpty()) 
        { 
            result = stringstack.peek() + result; 
            stringstack.pop(); 
        } 
       
        return result; 
    } 
}