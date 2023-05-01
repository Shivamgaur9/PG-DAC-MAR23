/* 23.Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float  */
 
public class Qus23 {
    public static void main(String[] args){
        float a = Float.BYTES;
        float b = Float.SIZE;
        float c = Float.MAX_VALUE;
        float d = Float.MIN_VALUE;

        System.out.println("the number of bytes used to represent a float value: " + a);
        System.out.println("the number of bits used to represent a float value : " + b);
        System.out.println("the minimum value of a float: " + c);
        System.out.println("the maximum value of a float : " + d);
    }
}