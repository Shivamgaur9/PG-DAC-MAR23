/* 27.Write a program to perform below operations on Double type to 
get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double */

public class Qus27 {
    public static void main(String[] args){
        double a = Double.BYTES;
        double b = Double.SIZE;
        double c = Double.MAX_VALUE;
        double d = Double.MIN_VALUE;

        System.out.println("the number of bytes used to represent a double value: " + a);
        System.out.println("the number of bits used to represent a double value : " + b);
        System.out.println("the minimum value of a double: " + c);
        System.out.println("the maximum value of a double : " + d);
    }
}