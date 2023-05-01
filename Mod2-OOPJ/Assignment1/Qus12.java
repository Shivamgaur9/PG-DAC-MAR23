/* 12.Write a program to perform below operations on short type to 
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short */

public class Qus12 {
    public static void main(String[] args){
        short a = Short.BYTES;
        short b = Short.SIZE;
        short c = Short.MAX_VALUE;
        short d = Short.MIN_VALUE;

        System.out.println("the number of bytes used to represent a short value: " + a);
        System.out.println("the number of bits used to represent a short value : " + b);
        System.out.println("the minimum value of a short: " + c);
        System.out.println("the maximum value of a short : " + d);
    }
}