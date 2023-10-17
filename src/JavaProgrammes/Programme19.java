package JavaProgrammes;
/**Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.*/
import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sample input: ");
        String inputString = scanner.nextLine();
        String lowercasestring = inputString.toLowerCase();
        System.out.println("Output: "+ lowercasestring);
        scanner.close();
    }

}
