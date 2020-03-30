
package beginerjava;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double sum=0;
        double [] num=new double[5];
        for (int i = 0; i <num.length; i++) {
           num[i]=input.nextInt();
            
        }
        for (int i = 0; i <num.length; i++) {
            sum=sum+num[i];
            
        }
        System.out.println("sum is : "+sum);
        double avg=sum/num.length;
        System.out.println("avarage: "+avg);
        double max =num[0];
        double min=num[0];
        for (int i = 1; i <num.length; i++) {
            if(max<num[i])
            {
                max =num[i];
            }
            if(min>num[i]){
                min=num[i];
            }
            
           
        }
         System.out.println("max"+max);
            System.out.println("min"+min);
    }
    
}
