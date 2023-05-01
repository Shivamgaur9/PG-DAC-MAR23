/* 25.Write a program to convert state of Float instance into byte, 
short, int, long, float and double.
 */
 public class Qus25 {
    public static void main(String[] args) {
        float Value = 67.08f;   // f for float 
        Float fs = new Float(Value); // Float instance

        byte num1 = fs.byteValue();      // instance method so called on object referenc
        System.out.println("Num1 :" + num1);

        short num2 = fs.shortValue();         // instance method so called on object referenc
        System.out.println("Num2 :" + num2);

        int num3 = fs.intValue();             // instance method so called on object referenc
        System.out.println("Num3 :" + num3);

        long num4 = fs.longValue();           // instance method so called on object referenc
        System.out.println("Num4 :" + num4);

        float num5 = fs.floatValue();        // instance method so called on object referenc
        System.out.println("Num5 :" + num5);

        double num6 = fs.doubleValue();      // instance method so called on object referenc
        System.out.println("Num6 :" + num6);
    }
}