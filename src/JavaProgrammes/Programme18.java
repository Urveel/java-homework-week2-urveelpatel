package JavaProgrammes;
/**Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5*/
import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        double num1 = input.nextDouble();
        System.out.println("Input second number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double subtract= num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
        double remainder = num1 % num2;

        System.out.println( num1 + " + "+ num2 + " =" + sum);
        System.out.println( num1 + " - "+ num2 + " =" + subtract);
        System.out.println( num1 + " x "+ num2 + " =" + multiply);
        System.out.println( num1 + " / "+ num2 + " =" + divide);
        System.out.println( num1 + " % "+ num2 + " =" + remainder);
        input.close();

    }

}
