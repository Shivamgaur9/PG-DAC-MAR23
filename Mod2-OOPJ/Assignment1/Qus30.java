/* 30.Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.  */

public class Qus30{
    public static void main(String[] args){
        double a = 20.99;
        double b = 19.01;
        double sum = Double.sum( a, b);   
        System.out.println("sum : " + sum); // sum of two integer numbers 

        double max = Double.max( a, b);   
        System.out.println("Max : " + max );//
        
        double min = Double.min( a, b);   
        System.out.println("Min : " + min);   
    }
}