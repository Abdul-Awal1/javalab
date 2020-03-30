
package beginerjava;

import java.util.Scanner;
public class series {
    public static void main (String args[]){
      Scanner input = new Scanner (System.in ); 
      int n,sum=1;
        System.out.print("Enter the last digit of the series :");
        n=input.nextInt();
        for(int i =1;i<=n;i=i+2){
            System.out.print(i+" ");
             sum =sum*i;
        }
        System.out.println("");
        System.out.println(sum);
        
        
        
    }
    
}
