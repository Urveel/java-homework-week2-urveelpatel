package JavaProgrammes;
/**Write a Java program that takes a number as input and prints its
 multiplication table up to 10.
 Test Data: Input a number: 8
 Expected Output :
 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 ...
 8 x 10 = 80*/
import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i= 1; i <= 10; i++){
            int result = number *i;
            System.out.println(number + "x " + i + "=" + result);
        }
        scanner.close();
    }
}
