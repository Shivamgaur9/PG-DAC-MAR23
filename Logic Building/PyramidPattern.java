//PYRAMID PATTERNS  here n=9
import java.util.*;
public class PyramidPattern {
    
    public static void Pattern1(int n) {
        System.out.println("-------------------------Pattern1------------------------->");
        for(int i=1; i<=n; i++) {
            for( int j=1; j<=(n-i+1); j++){ // for spaces
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){ //for patttern
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    /*   1 
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9    */

    public static void Pattern2(int n) {
        System.out.println("-------------------------Pattern2------------------------->");
        for(int i=1; i<=n; i++) {
            for( int j=1; j<=(n-i+1); j++){ // for spaces
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){ //for patttern
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
     /*  1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9   */ 

     public static void Pattern3(int n) {
        System.out.println("-------------------------Pattern3------------------------->");
        for(int i=1; i<=n; i++) {
            for( int j=1; j<=(n-i+1); j++){ // for spaces
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){ //for patttern
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*       *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *     */

    public static void Pattern4(int n){
		System.out.println("-------------------------Pattern4------------------------->");
		for(int i=1; i<=n;i++){
			for( int j=1; j<=(n-i+1); j++){ //for spaces
				System.out.print("  ");
			}
			//divide into two triangle
			//for 1st halfPattern
			for(int j=1;j<=i;j++){
				System.out.print(j + " ");
			}
			//for 2nd halfPattern
			for(int j=(i-1);j>=1;j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	} 
        /*        1
                1 2 1
              1 2 3 2 1 
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1       */

     public static void Pattern5(int n){
		System.out.println("-------------------------Pattern5------------------------->");
		for(int i=1; i<=n;i++){
			for( int j=1; j<=(n-i+1); j++){ //for spaces
				System.out.print("  ");
			}
			//divide into two triangle
			//for 1st halfPattern
			for(int j=(n-i+1);j<=n;j++){ 
				System.out.print(j + " ");
			}
			//for 2nd halfPattern
			for(int j=(n-1);j>=(n-i+1);j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	} 
      /*          9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6 
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1      */

    public static void Pattern6(int n) {
        System.out.println("-------------------------Pattern6------------------------->");
        for(int i=n; i>=1 ;i--) {
            for( int j=1; j<=(n-i+1); j++){ // for spaces
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){ //for patttern
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     /*         
           * * * * * * * * *
            * * * * * * * *
             * * * * * * *
              * * * * * *
               * * * * *
                * * * *
                 * * *
                  * *
                   *           */
    public static void Pattern7(int n) {
        System.out.println("-------------------------Pattern7------------------------->");
        for(int i=n; i>=1 ;i--) {
            for( int j=1; j<=(n-i+1); j++){ // for spaces
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){ //for patttern
                System.out.print(i + " ");
            }
            System.out.println();
        }
    } 
 /*   9 9 9 9 9 9 9 9 9
       8 8 8 8 8 8 8 8
        7 7 7 7 7 7 7
         6 6 6 6 6 6
          5 5 5 5 5
           4 4 4 4
            3 3 3
             2 2
              1      */            
                  


    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();
        Pattern1(n);
        Pattern2(n);
        Pattern3(n);
        Pattern4(n);
        Pattern5(n);
        Pattern6(n);
        Pattern7(n);  
    }
}



   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   