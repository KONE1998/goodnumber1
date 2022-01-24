import java.util.Scanner;  
public class GoodNumberSolution  
{  
//method for reverse a number  
public static void isGoodNumber(int number1)
{  
   
        int c=0;
        String number = String.valueOf(number1);
        

        String[] digits = number.split("(?<=.)");

        for(int i = 0; i < digits.length; i++) {
            
            int value=Integer.parseInt(digits[i]); 
           
            while(value!=0)
            {
            value=value%3;
            if(value==0)
                {
                    c=c+1;
                    if(c!=0)
                    {
                         System.out.println("TRUE");
                    }
                    break;
                    
                    
            
                }
                
            else
                System.out.println("FALSE");
                break;
           
            }
            
            
            
            
        }
        

}  
public static void main(String args[])  
{  
 int number1 = 333;

isGoodNumber(number1); 

//method calling  
 
}  
}  