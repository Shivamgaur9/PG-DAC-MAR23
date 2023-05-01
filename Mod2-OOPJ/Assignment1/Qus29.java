/* 29.Write a program to convert state of Double instance into byte, 
short, int, long, float and double. */
public class Qus29 {
    public static void main(String[] args) {
        double Value = 69.609;
        Double ds = new Double(Value); // Double instance

        byte num1 = ds.byteValue();      // instance method so called on object referenc
        System.out.println("Num1 :" + num1);

        short num2 = ds.shortValue();         // instance method so called on object referenc
        System.out.println("Num2 :" + num2);

        int num3 = ds.intValue();             // instance method so called on object referenc
        System.out.println("Num3 :" + num3);

        long num4 = ds.longValue();           // instance method so called on object referenc
        System.out.println("Num4 :" + num4);

        float num5 = ds.floatValue();        // instance method so called on object referenc
        System.out.println("Num5 :" + num5);

        double num6 = ds.doubleValue();      // instance method so called on object referenc
        System.out.println("Num6 :" + num6);
    }
}