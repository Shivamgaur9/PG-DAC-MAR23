/* 26.Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.*/

public class Qus26{
    public static void main(String[] args){
        float a = 20.23f;
        float b = 8.4f;
        float sum = Float.sum( a, b);   
        System.out.println("sum : " + sum); // sum of integer

        float max = Float.max( a, b);   
        System.out.println("Max : " + max );//
        
        float min = Float.min( a, b);   
        System.out.println("Min : " + min);   
    }
}