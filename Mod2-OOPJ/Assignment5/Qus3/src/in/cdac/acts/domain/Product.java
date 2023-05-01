package in.cdac.acts.domain;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@ToString
public class Product {
	private String name;
	private double price;
	private String category;

	private static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		System.out.println("Enter the Product name :");
		this.name = sc.nextLine();
		System.out.println("Enter the price :");
		this.price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the category :");
		this.category = sc.nextLine();

	}

	@Override
	public String toString() {
		return String.format("%-20s%-5.0f%-10s", name, price, category);
	}
}
