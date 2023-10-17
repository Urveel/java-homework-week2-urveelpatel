package JavaProgrammes;
/**Write a Java program to add two binary numbers.

 Input Data:
 Input first binary number: 10
 Input second binary number: 11
 Expected Output:

 Sum of two binary numbers: 101*/
import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter First Binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Please enter Second Binary number: ");
        String binary2 = scanner.nextLine();
        String sum = addBinary(binary1 , binary2);
        System.out.println("Sum of two Binary numbers: " + sum);

        scanner.close();
    }
    public static String addBinary(String binary1, String binary2){
        int num1 = Integer.parseInt(binary1, 2);
        int num2= Integer.parseInt(binary2, 2);
        int sum= num1 + num2;
        return Integer.toBinaryString(sum);

    }

}
