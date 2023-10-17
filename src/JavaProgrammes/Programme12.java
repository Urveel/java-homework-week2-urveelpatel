package JavaProgrammes;
/**Write a Java program to compute the specified expressions and print the
 output.
 Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 Expected Output : 2.138888888888889*/
public class Programme12 {
    public static void main(String[] args) {
        double a = 25.5;
        double b= 3.50;
        double c = 40.50;
        double d= 4.50;
        double ans = ((a * b-b* b) / (c -d));
        System.out.println(ans);
    }
    }

