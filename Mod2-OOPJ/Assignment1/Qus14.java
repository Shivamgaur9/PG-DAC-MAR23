/* 14.Write a program to convert state of Short instance into byte, 
short, int, long, float and double. */

public class Qus14 {
    public static void main(String[] args) {
        short Value = 6780;
        Short si = new Short(Value); // Short instance

        byte num1 = si.byteValue();      // instance method so called on object referenc
        System.out.println("Num1 :" + num1);

        short num2 = si.shortValue();         // instance method so called on object referenc
        System.out.println("Num2 :" + num2);

        int num3 = si.intValue();             // instance method so called on object referenc
        System.out.println("Num3 :" + num3);

        long num4 = si.longValue();           // instance method so called on object referenc
        System.out.println("Num4 :" + num4);

        float num5 = si.floatValue();        // instance method so called on object referenc
        System.out.println("Num5 :" + num5);

        double num6 = si.doubleValue();      // instance method so called on object referenc
        System.out.println("Num6 :" + num6);
    }
}