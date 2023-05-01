package in.cdac.acts.main;

import java.util.Scanner;

import in.cdac.acts.domain.Dish;

public class Restaurant {
	static Scanner sc = new Scanner(System.in);
	static int index;
	Dish[] arr;

	public Restaurant() {
		this(2);
	}

	public Restaurant(int capacity) {
		this.arr = new Dish[capacity];
//		arr[0] = new Dish(" Shivam",101);

	}

	public void removeDish(int dish) {
		for (int index = 0; index < arr.length; ++index) {
			if (this.arr[index] != null && this.arr[index].getSrn() == dish) {
				this.arr[index] = null;
			}
		}
	}

	public void addNewDish(Dish dish) {
		if (index < this.arr.length) {
			this.arr[index] = dish;
			index = index + 1;
		} else {
			System.out.println("Menu is full");
		}
	}

	public void modifyThePrice(int dish) {
		for (int index = 0; index < arr.length; index++) {
			if (this.arr[index] != null && this.arr[index].getSrn() == dish) {
				System.out.println("Please enter the modified price");
				this.arr[index].setPrice(sc.nextFloat());
			}
		}

	}

	public void viewMenu() {
		for (Dish dish : arr) {
			if (dish != null)
				System.out.println(dish);
		}
	}
}
