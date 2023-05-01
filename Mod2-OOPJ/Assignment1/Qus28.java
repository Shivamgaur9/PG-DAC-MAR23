/* 28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class). */

public class Qus28 {
    public static void main(String[] args){
        double i = 12;        
        String str1 = Double.toString(i);// short value into String
        System.out.println(str1);
        
        Double obj = new Double(i); // Double instance
        System.out.println(obj);
        
        String str2 = new String("1234"); //String instance
        Double d = new Double(str2);     //String instance into Double instance
        //double d = Double.parseLong(str2); 
        System.out.println(d);
        
        long val = Double.doubleToLongBits(i);
        String bin = Long.toBinaryString(val); // double value into binary
        System.out.println(bin);

        String oct = Long.toOctalString(val); // double value into octal
        System.out.println(oct);  
   
        String hex = Double.toHexString(i); // double value into hexadecimal
        System.out.println(hex);
    }
 }