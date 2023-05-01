package in.cdac.acts.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import in.cdac.acts.domain.MenuItem;
import in.cdac.acts.domain.Restaurant;
import in.cdac.acts.domain.caloriesComparator;
import in.cdac.acts.domain.nameComparator;
import in.cdac.acts.domain.priceComparator;

public class Test {

	private static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Sort by Name");
		System.out.println("2.Sort by price");
		System.out.println("3.Sort by calories");
		System.out.println("4.Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		Restaurant res = new Restaurant();
		System.out.println("unsorted array");

		res.printArray();
		System.out.println("sorted by natural ordering of price using comparable");
		Arrays.sort(res.getArr()); // one parameter call comparable
		res.printArray();

		int choice;
		while ((choice = Test.menuList()) != 0) {
			Comparator<MenuItem> comparator = null;
			switch (choice) {
			case 1:
				System.out.println("sorted by name using comparator");
				comparator = new nameComparator();
				break;
			case 2:
				System.out.println("sorted by price using comparator");
				comparator = new priceComparator();
				break;
			case 3:
				System.out.println("sorted by calories using comparator");
				comparator = new caloriesComparator();
				break;
			}
			Arrays.sort(res.getArr(), comparator); // two parameter call comparator
			res.printArray();
		}
	}
}
