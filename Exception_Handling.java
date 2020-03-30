package exception;

import java.util.Scanner;

public class Exception_Handling {

    public static void main(String[] args) {

        while (true) {
            try {
                int num1, num2, result;
                Scanner input = new Scanner(System.in);

                System.out.print("Please enter num1:");
                num1 = input.nextInt();

                System.out.print("Please enter num2:");
                num2 = input.nextInt();

                result = num1 / num2;

                System.out.println("Result :" + num1 + "/" + num2 + " =" + result);

            } catch (Exception exp) {
                System.out.println("Exception: " + exp);
                System.out.println("You must enter integer. Please try again");

            }

        }

    }
}
