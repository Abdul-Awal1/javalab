
package beginerjava;

import java.util.Scanner;

public class Loop2Demo {
    
    public static void main (String args[]){
         
        int sum=0,m,n;
        Scanner input =new Scanner (System.in);
        m=input.nextInt();
        n=input.nextInt();
        for(int i =m;i<=n;i++){
            sum=sum+i;
            
        }
        System.out.println("Sum is "+sum);
        
    }
            
    
}

    
}
