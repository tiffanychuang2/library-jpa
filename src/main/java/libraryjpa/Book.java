package libraryjpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue

	private String bookTitle;

	@ManyToOne
	private Genre genre;

	@ManyToMany
	private Set<Author> bookAuthors;

	// constructors
	protected Book() {
	}

	public Book(Genre genre, String bookTitle, Author... bookAuthors) {
		this.genre = genre;
		this.bookTitle = bookTitle;
		this.bookAuthors = new HashSet(Arrays.asList(bookAuthors));
	}

	// getters
	public Genre getGenre() {
		return genre;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public Set<Author> getBookAuthors() {
		return bookAuthors;
	}

	// setters
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setBookAuthors(Set<Author> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}

	@Override
	public String toString() {
		return genre + "" + bookTitle + "" + bookAuthors;
	}
}
