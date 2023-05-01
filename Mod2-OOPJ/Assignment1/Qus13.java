/* 13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance. */

 public class Qus13 {
    public static void main(String[] args){
        short a = 1355;        
        String str1 = Short.toString(a);// short value into String
        System.out.println(str1);
        
        short b = 9999;
        Short bs1 = new Short(b); // Short instance
        System.out.println(bs1);
        
        String str2 = new String("1288");
        Integer d = new Integer(str2);     //String instance into Integer instance
        //short bs2 = Short.parseShort(str2); 
        System.out.println(d);
    }
 }