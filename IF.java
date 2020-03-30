
package beginerjava;
import java.util.Scanner;

public class IF {
    public static void main (String args[]){
        
        int num;
        Scanner input =new Scanner (System.in);
        num=input.nextInt();
        
        if(num>0)
        {
            System.out.println("Positive number is :"+num);
        }
        else if(num==0){
        
        System.out.println("zero");
    }
        else{ 
            System.out.println("negative number");
        }
    }
    
}
