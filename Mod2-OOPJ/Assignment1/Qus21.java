/* 21.Write a program to convert state of Long instance into byte, 
short, int, long, float and double.
 */
 public class Qus21 {
    public static void main(String[] args) {
        long Value = 678099L;
        Long ls = new Long(Value); // Long instance

        byte num1 = ls.byteValue();      // instance method so called on object referenc
        System.out.println("Num1 :" + num1);

        short num2 = ls.shortValue();         // instance method so called on object referenc
        System.out.println("Num2 :" + num2);

        int num3 = ls.intValue();             // instance method so called on object referenc
        System.out.println("Num3 :" + num3);

        long num4 = ls.longValue();           // instance method so called on object referenc
        System.out.println("Num4 :" + num4);

        float num5 = ls.floatValue();        // instance method so called on object referenc
        System.out.println("Num5 :" + num5);

        double num6 = ls.doubleValue();      // instance method so called on object referenc
        System.out.println("Num6 :" + num6);
    }
}