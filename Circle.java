
package beginerjava;
import java.util.Scanner;
public class Circle {
    public static void main (String args [])
    {
        double radius,pie=3.1416,area;
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the radius :");
        radius =input.nextDouble();
        
        area=pie*radius*radius;
        System.out.println("the area of a circle is : "+area);
        
        
        
        
    }
}
