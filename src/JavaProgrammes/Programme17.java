package JavaProgrammes;
/**Write a Java program to convert a decimal number to binary number.

 Input Data:
 Input a Decimal Number : 5
 Expected Output

 Binary number is: 101*/
import java.util.Scanner;

public class Programme17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        String binarynumber= Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number is: "+ binarynumber);
        scanner.close();
    }
}
