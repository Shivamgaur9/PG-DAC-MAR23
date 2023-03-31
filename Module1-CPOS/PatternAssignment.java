// PatternAssignment: numbers and alphabets (for n=5)

import java.util.*;

public class PatternAssignment{
	//functions for number and Alphabetical patterns
	public static void Pattern1(int n){
		System.out.println("-------------------------------Pattern1----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print(j + " ");
			}
			System.out.println();
		} 
	} 
	/*op: 
			 1              
			 1 2
			 1 2 3
			 1 2 3 4
			 1 2 3 4 5	 */
	
	public static void Pattern2(int n){
		System.out.println("-------------------------------Pattern2----------------------------------->");
		//char ch = 'A';
		//outer loop
		for(int i=1; i<=n;i++){
			char ch = 'A';
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print(ch + " ");
				ch++; //increment in ch
			}
			System.out.println();
		}
	} 
	/* op:
			A
			A B
			A B C
			A B C D
			A B C D E   */
	
	
	public static void Pattern3(int n){
		System.out.println("-------------------------------Pattern3----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	} 
	/* op: 
			*
			* *
			* * *
			* * * *
			* * * * *      */
	
	public static void Pattern4(int n){
		System.out.println("-------------------------------Pattern4----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	} 
	/* op:
			1
			2 2
			3 3 3
			4 4 4 4
			5 5 5 5 5    */
	
		public static void Pattern5(int n){
		System.out.println("-------------------------------Pattern5----------------------------------->");
		char ch = 'A';
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	} 
	/* op:
			A
			B B
			C C C
			D D D D
			E E E E E    */
	
	
	public static void Pattern6(int n){
		System.out.println("-------------------------------Pattern6---------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for spaces
			
			for(int j=(n-i);j>=1;j--){ 
				System.out.print("  ");
			}
			
			//for star
			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	} 
	/*
		          *
			* *
		      * * *
		   * * * *
		 * * * * *     */
	
	public static void Pattern7(int n){
		System.out.println("-------------------------------Pattern7----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for spaces
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			//for pattern
			for(int j=1;j<=i;j++){
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	} 
	/* op:
			    1
			   1 2
			  1 2 3
			 1 2 3 4
			1 2 3 4 5     */
	
	public static void Pattern8(int n){
		System.out.println("-------------------------------Pattern8----------------------------------->");
		//outer loop
		for(int i=1;i<=n;i++){
			//inner loop
			
			//for spaces
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			
			//for pattern
			for(int j=(n+1-i);j<=n;j++){ 
				System.out.print(j + " ");
			}
			System.out.println();
		}
	} 
	/* op:
			    5
			   4 5
			  3 4 5
			 2 3 4 5
			1 2 3 4 5     */
	
	public static void Pattern9(int n){
		System.out.println("-------------------------------Pattern9----------------------------------->");
		//outer loop
		for(int i=1;i<=n;i++){
			//inner loop
			//for spaces
			char ch = 'A';
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			
			//for pattern
			for(int j=1;j<=i;j++){ 
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
	/* op:
			    A
			   A B
			  A B C
			 A B C D
			A B C D E   */
				
	
	public static void Pattern10(int n){
		System.out.println("-------------------------------Pattern10----------------------------------->");
		//outer loop
		//char ch = 'E'; 
		int ch = 68; // for increment the value of ch in for loop 
		for(int i=1;i<=n;i++){
			//inner loop
			//for spaces
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			
			//for pattern
			for(int j=1;j<=i;j++){ 
				System.out.print((char)(ch + j) + " ");// typecast
				
			}
			System.out.println();
			ch--;
		}
	} 
	/* op:
			    E
			   D E
			  C D E
			 B C D E
			A B C D E    */
	
	public static void Pattern11(int n){
		System.out.println("-------------------------------Pattern11----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for spaces
			
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			//divide into two triangle
			//for 1st pattern
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//for 2nd pattern
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
	
	public static void Pattern12(int n){
		System.out.println("-------------------------------Pattern12----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for spaces
			
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			
			//for pattern
			for(int j=1;j<=i;j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	} 
	/* op:
			    1
			   2 2
			  3 3 3
			 4 4 4 4
			5 5 5 5 5	*/
	
	public static void Pattern13(int n){
		System.out.println("-------------------------------Pattern13----------------------------------->");
		//outer loop
		char ch = 'A';
		for(int i=1; i<=n;i++){
			//inner loop
			//for spaces
			
			for(int j=(n-i);j>=1;j--){ 
				System.out.print(" ");
			}
			
			//for pattern
			for(int j=1;j<=i;j++){
				System.out.print(ch + " ");
				//ch++;
			}
			System.out.println();
			ch++;
		}
	}
	/* op:
			    A
			   B B
			  C C C
			 D D D D
			E E E E E   */
	
	public static void Pattern14(int n){
		System.out.println("-------------------------------Pattern14----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for pattern
			for(int j=1;j<=(n-i+1);j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	/* op:
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1			*/
	
	public static void Pattern15(int n){
		System.out.println("-------------------------------Pattern15----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for pattern
			for(int j=n;j>=i;j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	/* op:
			5 4 3 2 1
			5 4 3 2
			5 4 3
			5 4
			5			*/
	
	public static void Pattern16(int n){
		System.out.println("-------------------------------Pattern16----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for pattern
			for(int j=n;j>=(n-i+1);j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	/* op:
			5
			5 4
			5 4 3
			5 4 3 2
			5 4 3 2 1	*/
	
	public static void Pattern17(int n){
		System.out.println("-------------------------------Pattern17----------------------------------->");
		//outer loop
		int k=1;
		for(int i=1; i<=n;i++){
			//inner loop
			//for pattern
			
			for(int j=1;j<=i;j++){
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	} 
	/* op:
			1
			2 3
			4 5 6
			7 8 9 10
			11 12 13 14 15   */
	
	public static void Pattern18(int n){
		System.out.println("-------------------------------Pattern18----------------------------------->");
		//outer loop
		for(int i=1; i<=n;i++){
			//inner loop
			//for pattern
			char ch = 'A';
			for(int j=n;j>=i;j--){
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
	/* op:
			A B C D E
			A B C D
			A B C
			A B
			A				*/
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		int n = sc.nextInt();
		
		Pattern1(n);
		Pattern2(n);
		Pattern3(n);
		Pattern4(n);
		Pattern5(n);
		Pattern6(n);
		Pattern7(n);
		Pattern8(n);
		Pattern9(n);
		Pattern10(n);
		Pattern11(n);
		Pattern12(n);
		Pattern13(n);
		Pattern14(n);
		Pattern15(n);
		Pattern16(n);
		Pattern17(n);
		Pattern18(n);

		sc.close();
	}
}
