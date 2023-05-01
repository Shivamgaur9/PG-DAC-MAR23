/* 24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string. */
public class Qus24 {
    public static void main(String[] args){
        float i = 99.99f;        
        String str1 = Float.toString(i);// short value into String
        System.out.println(str1);
        
        Float obj = new Float(i); // Float instance
        System.out.println(obj);
        
        String str2 = new String("1234"); //String instance
        Float d = new Float(str2);     //String instance into Float instance
        //float d = Float.parseLong(str2); 
        System.out.println(d);

        String hex = Float.toHexString(i); // float value into hexadecimal
        System.out.println(hex);
    }
 }