/*8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance. */
 public class Qus8 {
    public static void main(String[] args){
        byte a = 127;         // range -128 to 127
        String str1 = Byte.toString(a);// byte value into String
        System.out.println(str1);
        
        byte b = 99;
        Byte bs1 = new Byte(b); // Byte instance
        System.out.println(bs1);
        
        String str2 = new String("12");
        Integer d = new Integer(str2);     //String into Integer instance
        //Byte bs2 = Byte.parseByte(str2); 
        System.out.println(d);
    }
 }