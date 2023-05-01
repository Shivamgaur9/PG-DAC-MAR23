package in.cdac.acts.main;

import in.cdac.acts.domain.Dish;
import java.util.Scanner;

public class Program {

	private static void acceptRecord(Dish dish) {
		System.out.println("Enter the dish seriol no. : ");
		dish.setSrn(sc.nextInt());
		System.out.println("Enter your dish");
		sc.nextLine();
		dish.setDish(sc.nextLine());
		System.out.println("Enter the price : ");
		dish.setPrice(sc.nextFloat());

	}

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add new Dish");
		System.out.println("2.view Menu");
		System.out.println("3.Remove Dish");
		System.out.println("4.Modify the Price");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		Restaurant restaurant = new Restaurant(2);
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Dish dish = new Dish();
				System.out.println("MENU LIST");
				Program.acceptRecord(dish);
				restaurant.addNewDish(dish);
				break;
			case 2:
				restaurant.viewMenu();
				break;
			case 3:
				System.out.println("Enter the srn you want to remove :");
				restaurant.removeDish(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter the srn you want to modify the price :");
				restaurant.modifyThePrice(sc.nextInt());
				break;

			}
		}
	}

}