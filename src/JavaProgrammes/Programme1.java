package JavaProgrammes;
/** 1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme*/

public class Programme1{

    //Declare two instance variables

    int a= 10;
    String b= "Urveel";
    //Declare an instance method
    public void print(){
        //Call both instance variable inside the print statement
        System.out.println("Variable1 " +a);
        System.out.println("Variable2 " +b);
    }

    public static void main(String[] args) {
        //Create an object of the class
        Programme1 instance= new Programme1();

        //Call the instance method to print the variables
        instance.print();
    }

}
