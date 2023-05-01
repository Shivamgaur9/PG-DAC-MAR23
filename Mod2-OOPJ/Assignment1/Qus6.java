/* 6.Write a program to perform below operations on Boolean type to
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
 */
public class Qus6 {
    public static void main(String[] args){
        boolean flag = false;
        String str1 = Boolean.toString(flag);
        System.out.println(str1);

        Boolean bs =new Boolean(flag);//Boolean instsance
        System.out.println(bs);

        String str2 = "Shivam";
        boolean value = Boolean.valueOf(str2);//string value into booolean value
        System.out.println(str2);

        Boolean val =new Boolean(str2);//Boolean instance
        System.out.println(val); 
    }
}

