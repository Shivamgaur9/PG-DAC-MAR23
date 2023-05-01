package in.cdac.acts.domain;

public class Library {
	private Book[] arr = new Book[4];

	public Book[] getArray() {
		this.arr[0] = new Book("Supermab", "Shivam Gaur", 2011);
		this.arr[1] = new Book("BatMan", "Shivani Wakhre", 1983);
		this.arr[2] = new Book("kranti", "bhagat singh", 1857);
		this.arr[3] = new Book("IronMan", "Shubhanshu", 2011);
		return arr;
	}

	public void printAarray() {
		for (Book book : arr)
			System.out.println(book);

	}
}
