
package beginerjava;
import java.util.Scanner;

public class Triangle {
    public static void main (String [] args)
    {
        double base,height,area;
        Scanner input = new Scanner ( System.in );
        System.out.print("Enter The base :");
        base  =input.nextDouble();
            
        
        System.out.print("Enter The Height :");
        height  =input.nextDouble();
        
        area=0.5*base*height;
        System.out.println("The Area Of Triangle is "+area);
        
            
        
                
        
        
        
        
    }
    
}
