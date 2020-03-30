
package beginerjava;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner input=new Scanner ( System.in );
         int temp,remainder,sum=0;
        System.out.print("Enter e number: ");
        int num;
            num=input.nextInt();
       
         temp=num;
         
        while(temp!=0){
            remainder=temp%10;
            sum=sum*10+remainder;
            temp=temp/10;  
            
        }
        if (num==sum)
        {
            System.out.println("Palindrome number ");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}

