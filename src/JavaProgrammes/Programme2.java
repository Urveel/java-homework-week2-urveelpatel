package JavaProgrammes;
/**2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme**/
public class Programme2 {
    // Declare two static variables

    static int a = 50;
    static String name = "Urveel";

    public static void m1() {
        System.out.println("a: " + Programme2.a);
        System.out.println("name: " + Programme2.name);
    }

    //Declare a static method
    public static void main(String[] args) {

        m1();

    }
}
