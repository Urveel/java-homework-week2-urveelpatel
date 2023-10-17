package JavaProgrammes;
/**3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme*/
public class Programme3 {
    // Declare instance variable
    int a = 10;
    //Declare static variable
    static int b =20;



    public static void M1(){
        Programme3 programme3 = new Programme3();
        System.out.println("a: " + programme3.a);
        System.out.println("b: " + b);

    }
    public void M2(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        Programme3 programme3 = new Programme3();
        M1();
        programme3.M2();
    }
}
