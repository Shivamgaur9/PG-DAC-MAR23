// StarPatternAssignment:  (for n=5) dydsfdsytfdscy
import java.util.*;
public class StarPattern{
	//function for Star Pattern
	public static void StarPattern1(int n){
		System.out.println("-------------------------------StarPattern1----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
	            	for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		} 
	} 
	/*op: 
			*
			**
			***
			****
			*****	 */
	
	public static void StarPattern2(int n){
		System.out.println("-------------------------------StarPattern2---------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=(n-i);j>=1;j--){ //for spaces
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){   //for star
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/*op:
	            *
		   **
		  ***
		 ****
		*****      */
	
	public static void StarPattern3(int n){
		System.out.println("-------------------------------StarPattern3----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/* op: 
                *****
	        ****
		***
                **
	        *        */
	
	public static void StarPattern4(int n){
		System.out.println("-------------------------------StarPattern4----------------------------------->");
		//outer loop
		for(int i=1;i<=n;i++){
			//inner loop
			for(int j=2;j<=i;j++){ // for spaces
				System.out.print(" ");
			} 
			for(int j=n;j>=i;j--){ // for pattern 
				System.out.print("*");
			}
			System.out.println();
		}
	} 
    /*op:
			*****
			 ****
			  ***
			   **
			    *       */
	
	public static void StarPattern5(int n){
		System.out.println("-------------------------------StarPattern5----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=(n-i);j>=1;j--){ //for spaces
				System.out.print(" ");
			}
			//divide into two triangle
			//for 1st StarPattern
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//for 2nd StarPattern
			for(int j=2;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/* op:
			    *
			   ***
			  *****
			 *******
			*********      */
	
	public static void StarPattern6(int n){
		System.out.println("-------------------------------StarPattern6----------------------------------->");
		//outer loop
		for(int i=n; i>=1;i--){
			//inner loop
			for(int j=(n-i);j>=1;j--){ //for spaces
				System.out.print(" ");
			}
			//divide into two triangle
			for(int j=1;j<=i;j++){ //1st half
				System.out.print("*");
			}
			for(int j=2;j<=i;j++){  // 2nd half
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/* op:
			*********
 			 *******
  			  *****
                           ***
                            *	         */
	
	public static void StarPattern7(int n){
		System.out.println("-------------------------------StarPattern7----------------------------------->");
		// 1st half
		for(int i=1; i<=n;i++){
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			//divide into two triangle
			//for 1st StarPattern
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//for 2nd StarPattern
			for(int j=2;j<=i;j++){ 
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for(int i=n-1; i>=1;i--){
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=2;j<=i;j++){ 
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/* op:

	    *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *             */
	
	public static void StarPattern8(int n){
		System.out.println("-------------------------------StarPattern8----------------------------------->");
		//1st half
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		} 
		//2nd half
		for(int i=n-1;i>=1;i--){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		} 
	} 
	
	/*op: 
			*
			**
			***
			****
			*****
			****
			***
			**
			*            */
	
	public static void StarPattern9(int n){
		System.out.println("-------------------------------StarPattern9----------------------------------->");
		//1st half 
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=(n-i);j>=1;j--){ //for spaces
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){   //for star
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for(int i=n-1;i>=1;i--){
			//inner loop
			for(int j=(n-i);j>=1;j--){ //for spaces
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){   //for star
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/* op: 
    		    *
   		   **
  		  ***
 		 ****
		*****
 	         ****
  		  ***
   		   **
   		    *        */
				
	public static void StarPattern10(int n){
		System.out.println("-------------------------------StarPattern10----------------------------------->");
		 for(int i=1; i<=n; i++){

            // spaces 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
                }

            // star 
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();    
        }
    }       
	/* op:
		       *****
		      *****
                     *****
		    *****
	           *****	    */
	
	public static void StarPattern11(int n){
		System.out.println("-------------------------------StarPattern11----------------------------------->");
		 for(int i=n; i>=1; i--){

            // spaces 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
                }

            // star 
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();    
        }
    }       
	/* op: 
	       *****
                *****
                 *****
                  *****
                   *****       */
	
	public static void StarPattern12(int n){
		System.out.println("-------------------------------StarPattern12----------------------------------->");
		//1st half
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for(int i=n-1;i>=1;i--){
			//inner loop
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		} 
	} 
	/*op: 
			*****
			****
			***
			**
			*
			**
			***
			****
			*****	        */
	
	public static void StarPattern13(int n){
		System.out.println("-------------------------------StarPattern13----------------------------------->");
		//1st half
		for(int i=1;i<=n;i++){
			//inner loop
			for(int j=2;j<=i;j++){ // for spaces
				System.out.print(" ");
			} 
			for(int j=n;j>=i;j--){ // for pattern 
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for(int i=n-1;i>=1;i--){ 
			//inner loop
			for(int j=2;j<=i;j++){ // for spaces
				System.out.print(" ");
			} 
			for(int j=n;j>=i;j--){ // for pattern 
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	/*op: 
	   *****
            ****
             ***
              **
               *
              **
             ***
            ****
           *****            */
	
	public static void StarPattern14(int n){
		System.out.println("-------------------------------StarPattern14----------------------------------->");
		//1st half
		for(int i =1;i<=n;i++){
			for(int j=n; j>=(n-i+1); j--){
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		//2nd half
		//1st half
		for(int i=n-1; i>=1;i--){      // (n-1) for reverse 
			for(int j=n; j>=(n-i+1); j--){
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/*op:
			* * * * *
 			 * * * *
   			  * * *
   			   * *
     			    * 
    		           * *
   			  * * *
 			 * * * *
 			* * * * *        */
	

	public static void StarPattern15(int n){
		System.out.println("-------------------------------StarPattern15----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				if( j == 1 || j==i || i==n ){
				System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
	} 
	/*op:
			*          
			**
			* *
			*  *
			*****        */

	public static void StarPattern16(int n){
		System.out.println("-------------------------------StarPattern16----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1; j<=(n-i); j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if( j == 1 || j==i || i==n ){
				System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
	} 
    /*op:
		     *
		    **
		   * *
		  *  *
		 *****        */
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		int n = sc.nextInt();
		
		StarPattern1(n);
		StarPattern2(n);
		StarPattern3(n);
		StarPattern4(n);
		StarPattern5(n);
		StarPattern6(n);
		StarPattern7(n);
		StarPattern8(n);
		StarPattern9(n);
		StarPattern10(n);
		StarPattern11(n);
		StarPattern12(n);
		StarPattern13(n);
		StarPattern14(n);
		StarPattern15(n);
		StarPattern16(n);
		
		sc.close();
	}
}
