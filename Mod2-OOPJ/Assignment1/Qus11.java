/* 11.Accept character from command line and perform below operations. Here you can use charAt() method to extract 
character:
a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and print it well as its code point. 
If it is in uppercase then convert it into lower case and print it well as its code point. */

public class Qus11 {

    public static void main(String[] args){
        String str = args[0];
        char ch = str.charAt(0);    
        // System.out.println(ch);
        boolean b1 = Character.isDigit(ch);//returntype boolean
        if ( b1 == true){
            System.out.println(args[0]);
            System.out.println("Code point : " + str.codePointAt(0));
        } else {
            boolean b2 = Character.isLowerCase(ch);//returntype boolean
            //class Character
            if ( b2 == true) {
                char ch2 = Character.toUpperCase(ch);//returntype boolean
                System.out.println("Converting the argument to upper case :" + ch2);
                System.out.println("Code point : " + str.codePointAt(0));
            } else {
                char ch3 = Character.toLowerCase(ch);//returntype boolean
                System.out.println("Converting the argument to lower case :" + ch3);
                System.out.println("Code point : " + str.codePointAt(0));
            }
        }
    }
}
/* C:\Users\lenovo\Desktop\Cdac\Module2-OOPJ\Assignment1>javac Qus11.java
C:\Users\lenovo\Desktop\Cdac\Module2-OOPJ\Assignment1>java Qus11 2  
2
Code point : 50
C:\Users\lenovo\Desktop\Cdac\Module2-OOPJ\Assignment1>javac Qus11.java 
C:\Users\lenovo\Desktop\Cdac\Module2-OOPJ\Assignment1>java Qus11 Shivam
Converting the argument to lower case :s
Code point : 83 */