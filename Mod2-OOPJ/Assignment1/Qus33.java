/*33. Pass integer, float and double value from command line. Parse
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
Reference:https://docs.oracle.com/javase/tutorial/java/nutsand
bolts/switch.html
*/
import java.util.*;
public class Qus33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a= Integer.parseInt(args[0]);
        float b= Float.parseFloat(args[1]);
        double c= Double.parseDouble(args[2]);

        System.out.println("Enter your choice:"+"1. for Addition "+"2. for Subtraction "+"3. for Multiplication"+"4. for Division");
        int choice =sc.nextInt();
        switch (choice) {
            case 1:  System.out.println("Result= "+(a+b+c));
                     break;
            case 2:  System.out.println("Result= "+(a-b-c));
                     break;
            case 3:  System.out.println("Result= "+(a*b*c));
                     break;
            case 4:  System.out.println("Result= "+(a/b/c));
                     break;         
            default: System.out.println("Invalid input");
                      break;
        }

    }
}
/*C:\Users\lenovo\Desktop\Cdac\Module2-OOPJ\Assignment1>javac Qus33.java

C:\Users\lenovo\Desktop\Cdac\Module2-OOPJ\Assignment1>java Qus33 1 2.0f 3.00
Enter your choice:1. for Addition 2. for Subtraction 3. for Multiplication4. for Division
4
Result= 0.16666666666666666 
*/