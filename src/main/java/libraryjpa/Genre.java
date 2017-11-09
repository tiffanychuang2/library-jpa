package libraryjpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;

	private String genre;

	@OneToMany(mappedBy = "genre")
	private Set<Book> booksInGenre; // used for individual pages ex: author.html, genre.html

	// constructors
	protected Genre() {
	}

	public Genre(String genre) {
		this.genre = genre;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	public Set<Book> getBooksInGenre() {
		return booksInGenre;
	}

	// setters
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return genre;
	}

}
