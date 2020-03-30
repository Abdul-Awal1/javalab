
package beginerjava;
import java.util.Scanner;

public class PrimeNumber {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        int num,count=0;
        System.out.print("Enter any integer number : ");
        num=input.nextInt();
        for (int i = 2; i<num; i++)
        {
          if(num%i==0){
              count++;
              break;
                      
          }  
          
          
        }
        
        
      if(count==0)
          {
              System.out.println("The number is Prime");
          }
          else 
          {
              System.out.println("not Prime");
          }  
    }
    
}
