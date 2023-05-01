/* 22. Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long. */
public class Qus22{
    public static void main(String[] args){
        long a = 20798789;
        long b = 88787878;
        long sum = Long.sum( a, b);   
        System.out.println("sum : " + sum); // sum of integer

        long max = Long.max( a, b);   
        System.out.println("Max : " + max );//
        
        long min = Long.min( a, b);   
        System.out.println("Min : " + min);   
    }
}