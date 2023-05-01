/* 15. Write a program to perform below operations on int type to 
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer */

public class Qus15 {
    public static void main(String[] args){
        int a = Integer.BYTES;
        int b = Integer.SIZE;
        int c = Integer.MAX_VALUE;
        int d = Integer.MIN_VALUE;

        System.out.println("the number of bytes used to represent a Integer value: " + a);
        System.out.println("the number of bits used to represent a Integer value : " + b);
        System.out.println("the minimum value of a Integer: " + c);
        System.out.println("the maximum value of a Integer : " + d);
    }
}