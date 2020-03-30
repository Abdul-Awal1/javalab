
package beginerjava;

import java.util.Scanner;


public class Temperature {
    public static void main (String args[]){
        
        double farenhite,celcius;
        System.out.print("enter the temperature of celcius:");
        Scanner input =new Scanner ( System.in);
        celcius=input.nextDouble();
        
        farenhite=(celcius-32)*0.57;
        System.out.println("temperature Farenhite is :"+farenhite);
        
        
    }
    
}
