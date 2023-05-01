package in.cdac.acts.domain;

public class Dish {
	private String dish;
	private float price;
	private int srn;

	public Dish() {
		// TODO Auto-generated constructor stub
	}

	public Dish(String dish, float price) {
		this.dish = dish;
		this.price = price;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSrn() {
		return srn;
	}

	public void setSrn(int srn) {
		this.srn = srn;
	}

	public String toString() {
		return String.format("%-15d %-15s% -5f", this.srn, this.dish, this.price);
	}
}
