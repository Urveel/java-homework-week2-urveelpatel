package JavaProgrammes;
/**Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.*/
import java.util.Scanner;

public class Programme13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = input.nextDouble();

        double average = (num1 +num2 + num3)/3;

        System.out.println("Average " + average);
        input.close();
    }
}
