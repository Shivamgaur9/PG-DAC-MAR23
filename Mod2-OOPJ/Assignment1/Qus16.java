/* 16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
 */
 public class Qus16 {
    public static void main(String[] args){
        int i = 1244;     
        String str1 = Integer.toString(i);// int value into String
        System.out.println(str1);
        
        Integer obj = new Integer(i); // Integer instance
        System.out.println(obj);
        
        String str2 = new String("123"); //String instance
        Integer d = new Integer(str2);     //String instance into Integer instance
        //int d = Integer.parseInt(str2); 
        System.out.println(d);

        String bin = Integer.toBinaryString(i); // int value into binary
        System.out.println(bin);

        String oct = Integer.toOctalString(i); // int value into octal
        System.out.println(oct);

        String hex = Integer.toHexString(i); // int value into hexadecimal
        System.out.println(hex);

    }
 }