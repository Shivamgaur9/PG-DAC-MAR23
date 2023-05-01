/*7.Write a program to perform below operations on byte type to
get:
a. The number of bits used to represent a byte value
b. The number of bytes used to represent a byte value
c. The minimum value a byte
d. The maximum value a byte         */

public class Qus7 {
    public static void main(String[] args){
        byte a = Byte.BYTES;
        byte b = Byte.SIZE;
        byte c = Byte.MAX_VALUE;
        byte d = Byte.MIN_VALUE;

        System.out.println("the number of bytes used to represent a byte value: " + a);
        System.out.println("the number of bits used to represent a byte value : " + b);
        System.out.println("the minimum value of a byte: " + c);
        System.out.println("the maximum value of a byte : " + d);
    }
}