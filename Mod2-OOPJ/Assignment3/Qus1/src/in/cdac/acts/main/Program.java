package in.cdac.acts.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	static int n;
	static int index;
	static double sum;
	static double average;
	static int largest;
	static int smallest;
	
	static Scanner sc = new Scanner(System.in);
	
	private static void acceptRecord(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length;  index++ ) {
				System.out.print("Enter element : ");
				arr[ index ] = sc.nextInt();
			}
		}
	}
	
	private static void displayRecord(int[] arr) {
		/*if( arr != null ) {
			for( int index = 0; index < arr.length;  index++ ) {
				System.out.print( arr[index] + " ");
			}
			System.out.println();
		}*/
		System.out.println("Array : "+Arrays.toString(arr)); // another method to print array element
	}
	
	private static double getSum(int[] arr) {
		sum = 0;
		if( arr != null ) {
			for( int index = 0; index < arr.length;  index++ ) {
				sum=sum+arr[index];		
			}
			System.out.println("Sum of array's element :"+ sum);
		}
		return sum;
	}
	
	private static double getAverage(int[] arr) {
		double average = sum/n ;
		System.out.println("average of array's element :"+ average);
		return average;
	}
	
	private static int getLargest(int[] arr) {
		largest = Integer.MIN_VALUE; // - infinity
		
		for( int index = 0; index < arr.length;  index++ ) {
			if(largest < arr[index] ) {
				largest = arr[index];
			}
		}
		System.out.println("Largest element in array :"+ largest);
		return largest;
	}
	
	private static int getSmallest(int[] arr) {
		smallest = Integer.MAX_VALUE;
		
		for( int index = 0; index < arr.length;  index++ ) {
			if(smallest > arr[index] ) {
				smallest = arr[index];
			}
		}	
		System.out.println("Smallest element in array :"+ smallest);
		return smallest;
	}
	
	private static void sortedArrays(int[] arr) {
		Arrays.sort(arr); 
		System.out.print("sorted array"+Arrays.toString(arr) + " ");
	}
	
	public static void main(String[] args) {
		System.out.print("Enter Size of Array : ");
		n= sc.nextInt();
		int[] arr = new int[n];
		
		Program.acceptRecord(arr);
		Program.displayRecord(arr);
		Program.getSum(arr);
		Program.getAverage(arr);
		Program.getLargest(arr);
		Program.getSmallest(arr);
		Program.sortedArrays(arr);
			
		
	
	}	
}












