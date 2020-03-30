
package beginerjava;

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       int  num=input.nextInt();
       int temp,rem,sum=0;
       temp=num;
       while(temp!=0){
           rem=temp%10;
           sum=sum+rem*rem*rem;
           temp=temp/10;
       }
        if (num==sum){
            
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("not Armstrong");
        }
    }
    
}
