
package beginerjava;

import java.util.Scanner;


public class Fibonacchi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the last number :");
        int n = input.nextInt();
        int first =0;
        int secound =1;
        int fibo;
        System.out.print(first+" "+secound);
        for (int i =3; i <=n; i++) {
            fibo=first+secound;
            first=secound;
            secound=fibo;
            System.out.print(" "+fibo);
        }
        System.out.println(""); 
    }
    
}
