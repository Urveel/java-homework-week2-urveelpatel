package JavaProgrammes;
/**Write a Java program to swap two variables.*/
public class Programme15 {
    public static void main(String[] args) {

// Define two variables
        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//swap the variables
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}