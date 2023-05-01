package in.cdac.acts.main;

import java.util.Arrays;
import java.util.Comparator;

import in.cdac.acts.domain.Product;
import in.cdac.acts.domain.priceComparator;

public class Test {

	private static Product[] getArray() {
		Product[] arr = new Product[2];
		for (int index = 0; index < 2; index++) {
			System.out.println("Product :" + (index + 1));
			arr[index] = new Product();
			arr[index].acceptRecord();
		}
		return arr;

	}

	private static void printArray(Product[] arr) {
		for (Product element : arr)
			System.out.println(element);
	}

	public static void main(String[] args) {

		Product[] arr = Test.getArray();
		Test.printArray(arr);
		System.out.println();
		Comparator<Product> comparator = new priceComparator();

		Arrays.sort(arr, comparator);
		Test.printArray(arr);

	}

}
