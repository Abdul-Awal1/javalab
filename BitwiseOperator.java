
package beginerjava;


public class BitwiseOperator {
    public static void main (String args[]){
       int a =44;
       int b=16;
       int c,d=32;
       c=a&b;
        System.out.println("a&b :"+c);
        
        
       c=a|b;
        System.out.println("a|b :"+c);
        
        
       c=a^b;
        System.out.println("a^b :"+c);
      
        
       c=d>>3;
        System.out.println("a>>3 :"+c);
      
        
       c=d<< 3;
        System.out.println("a<<3 :"+c);
      
        
        
    }
}
