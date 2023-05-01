/* 17. Write bs program to convert state of Integer instance into 
byte, short, int, long, float and double. */

public class Qus17 {
    public static void main(String[] args) {
        int Value = 678;
        Integer bs = new Integer(Value); // Integer instance

        byte num1 = bs.byteValue();      // instance method so called on object referenc
        System.out.println("Num1 :" + num1);

        short num2 = bs.shortValue();         // instance method so called on object referenc
        System.out.println("Num2 :" + num2);

        int num3 = bs.intValue();             // instance method so called on object referenc
        System.out.println("Num3 :" + num3);

        long num4 = bs.longValue();           // instance method so called on object referenc
        System.out.println("Num4 :" + num4);

        float num5 = bs.floatValue();        // instance method so called on object referenc
        System.out.println("Num5 :" + num5);

        double num6 = bs.doubleValue();      // instance method so called on object referenc
        System.out.println("Num6 :" + num6);
    }
}