package JavaProgrammes;
/** Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C)*/
import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Fahrenheit: ");
        double fahrenheit = scanner.nextShort();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in degree Celsius is: " + celsius+ "°C" );
        scanner.close();
    }
}
