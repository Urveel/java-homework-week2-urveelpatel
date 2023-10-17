package JavaProgrammes;
/**Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods)*/
import java.util.Scanner;

public class Programme5 {
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("addition number: " + sum);
    }
    public void substation(int a , int b) {
        int sub = a - b;
        System.out.println("substation number:" + sub);
    }
    public static void multiplication(int a, int b){
        int mult= a*b;
        System.out.println("multiplication number:"+ mult);
    }

    public static void division(int a, int b){
        int div = a/b;
        System.out.println("division number:" +div);
    }

    public static void main(String[] args){
        Programme5 p5 = new Programme5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number a:");
        int a = scanner.nextInt();
        System.out.println("please enter number b:");
        int b = scanner.nextInt();
        p5.addition(a, b);
        p5.substation(a, b);
        multiplication(a, b);
        division(a, b);
        scanner.close();
    }
    }

