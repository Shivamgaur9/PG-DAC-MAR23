package in.cdac.acts.main;

import java.util.Arrays;

//import in.cdac.acts.domain.Book;
import in.cdac.acts.domain.Library;

public class Test {

	public static void main(String[] args) {

		Library lib = new Library();
		//Book[] arr = lib.getArray();

		lib.printAarray();
		System.out.println("Sorted books by publication year");
		Arrays.sort(lib.getArray());

		lib.printAarray();

	}

}
/*2. Create a program that will store and sort a collection of books based on their publication
year. Each book has a title, author, and publication year. The program should implement
the Comparable interface to provide a natural ordering of books based on their
publication year.
a. Create a Book class that has three properties: title, author, and publicationYear.
b. Implement the Comparable interface in the Book class so that books can be
sorted based on their publication year.
c. Create a Library class that has a list of Book objects.
d. Implement a sortBooks() method in the Library class that sorts the list of books
based on their publication year using the Collections.sort() method.
e. Display the sorted list of books to the console.*/