package in.cdac.acts.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int year;

	@Override
	public int compareTo(Book other) {
		return this.getYear() - other.getYear();
	}

	@Override
	public String toString() {
		return String.format("%-15s %-20s %-15d", title, author, year);

	}
}
