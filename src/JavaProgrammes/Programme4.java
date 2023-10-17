package JavaProgrammes;
/** 4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme*/

public class Programme4 {
    //Declare two instance
   int a = 10;
   int b = 20;
   //Declare two static
    static String name = "Urveel";
    static String Last = "Patel";
    // Declare one instance method

    public static void M1(){
        Programme4 programme4 = new Programme4();
        System.out.println("a: " + programme4.a);
        System.out.println("b: " + programme4.b);
        System.out.println("name:" + name);
        System.out.println("Last:" + Last);

    }
    //Declare one static method
    public void M2() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("last:" + Last);
        System.out.println("name:"+ name);

    }

    public static void main(String[] args) {
        Programme4 programme4 = new Programme4();
        M1();
        programme4.M2();
    }
}