/* 10.Write a program to perform below operations on char type to
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char */

public class Qus10 {
    public static void main(String[] args){ 
        int ch1 = Character.SIZE;
        System.out.println("The number of bits used to represent a char value : " + ch1);

        int ch2 = Character.BYTES;
        System.out.println("The number of bytes used to represent a char value : " + ch2);

        int ch3 = Character.MIN_VALUE;
        System.out.println("The minimum value a char :" + ch3); 

        int ch4 = Character.MAX_VALUE;
        System.out.println("The maximum value a char :"  + ch4); 
    }
}