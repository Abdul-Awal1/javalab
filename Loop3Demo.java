
package beginerjava;
import java.util.Scanner;

public class Loop3Demo {
    public static void main(String args[]){
        
        int sum=0,m,n;
        Scanner input =new Scanner (System.in);
        m=input.nextInt();
        n=input.nextInt();
        for(int i =m;i<=n;i++){
            if (i%2!=0){
            sum=sum+i;
                System.out.print(" " +i);
                    
            }
        }
        System.out.println("");
        System.out.println("Sum is "+sum);
        
        
    }
}
