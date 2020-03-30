
package beginerjava;
import java.util.Scanner;

public class EvenOdd {
    public static void main (String args[]){
        
   Scanner input=new Scanner (System.in);     
      int num;
      num=input.nextInt();
      
      if (num%2==0){
          System.out.println("Even number ");
      }
      else{
          System.out.println("Odd Number");
      }
        
    }
}
