
package beginerjava;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter a digit");
        int n =input.nextInt();
        int sum=0,remainder,temporary;
        temporary=n;
        while(temporary!=0){
             remainder=temporary%10;
             sum=sum*10+remainder;
             temporary=temporary/10;
             
            
            
        }
        System.out.println("Sum of digit"+sum);
    }
}
