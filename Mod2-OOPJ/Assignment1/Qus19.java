/* 19.Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long */

public class Qus19 {
    public static void main(String[] args){
        long a = Long.BYTES;
        long b = Long.SIZE;
        long c = Long.MAX_VALUE;
        long d = Long.MIN_VALUE;

        System.out.println("the number of bytes used to represent a long value: " + a);
        System.out.println("the number of bits used to represent a long value : " + b);
        System.out.println("the minimum value of a long: " + c);
        System.out.println("the maximum value of a long : " + d);
    }
}