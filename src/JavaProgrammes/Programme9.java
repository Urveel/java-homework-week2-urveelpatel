package JavaProgrammes;
/** Write a program to convert the upper case to lower case.*/
import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String in uppercase: ");
        String uppercaseString = scanner.nextLine();
        String Programme9 = uppercaseString.toLowerCase();
        System.out.println("String in lowercase : " + Programme9);
        scanner.close();

    }
}
