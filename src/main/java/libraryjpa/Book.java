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
	private Long id;
	private String bookTitle;

	@ManyToOne
	private Genre genre;

	@ManyToMany
	private Set<Author> bookAuthors; // used for individual pages ex: author.html, genre.html

	// constructors
	protected Book() {
	}

	public Book(Genre genre, String bookTitle, Author... bookAuthors) {
		this.genre = genre;
		this.bookTitle = bookTitle;
		this.bookAuthors = new HashSet(Arrays.asList(bookAuthors));
	}

	// getters
	public Long getId() {
		return id;
	}

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

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return genre + "" + bookTitle + "" + bookAuthors;
	}
}
