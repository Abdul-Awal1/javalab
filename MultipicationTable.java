
package beginerjava;
import java.util.Scanner;

public class MultipicationTable {
    public static void main (String args[]){
        Scanner input=new Scanner (System.in);
        int num1,num2;
        System.out.print("Enter first number : ");
        num1=input.nextInt();
        System.out.print("Enter second Number : ");
        num2=input.nextInt();
        for(int i =num1;i<=num2;i++){
            for(int j=1;j<=10;j++){
          System.out.println(i+"x"+j+"="+i*j);
        }
             System.out.println("");
        }
        
       
        
        
        
        
    }
    
}
