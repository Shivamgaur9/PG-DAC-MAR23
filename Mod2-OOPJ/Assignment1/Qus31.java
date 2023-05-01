/*31.Read the documentation of NumberFormatException and try to
generate it in Java code.
Reference:https://docs.oracle.com/javase/8/docs/api/java/lang/
NumberFormatException.html
*/

import java.util.*;

class Qus31
{
    public static void main(String[] args) 
    {
        String strNumber = new String( "123abcd" ); //java.lang.NumberFormatException
         int number = Integer.parseInt(strNumber);  
        
 
         System.out.println("Number : "+number);
    }
 }