package in.cdac.acts.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MenuItem implements Comparable<MenuItem> {
	private String name;
	private double price;
	private int calories;

	@Override
	public String toString() {
		return String.format("%-15s%-20.0f%-15d", name, price, calories);
	}

	@Override
	public int compareTo(MenuItem other) {
		return (int) (this.getPrice() - other.getPrice()) ;
	}

}
