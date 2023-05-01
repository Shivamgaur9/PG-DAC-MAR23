/* 20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string. */
public class Qus20 {
    public static void main(String[] args){
        long i = 1234567889;        
        String str1 = Long.toString(i);// short value into String
        System.out.println(str1);
        
        Long obj = new Long(i); // Long instance
        System.out.println(obj);
        
        String str2 = new String("1234"); //String instance
        Long d = new Long(str2);     //String instance into Long instance
        //long d = Long.parseLong(str2); 
        System.out.println(d);

        String bin = Long.toBinaryString(i); // long value into binary
        System.out.println(bin);

        String oct = Long.toOctalString(i); // long value into octal
        System.out.println(oct);

        String hex = Long.toHexString(i); // long value into hexadecimal
        System.out.println(hex);
    }
 }