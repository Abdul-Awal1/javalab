
package beginerjava;
import java.util.Scanner;

public class ConditionerDemo {
    public static void main (String args[]){
        Scanner input=new Scanner (System.in);
        
      int num1,num2;
        System.out.print("Enter number 1:");
        num1=input.nextInt();
        System.out.print("Enter number 2: ");
        num2=input.nextInt();
        int large =(num1>num2)? num1: num2;
        System.out.println("Larger Number is :"+large);
      
    }
}
