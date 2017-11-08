package libraryjpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private String genre;

	@OneToMany(mappedBy = "genre")
	private Set<Book> books = new HashSet<Book>();

	// constructors
	protected Genre() {
	}

	public Genre(String genre) {
		this.genre = genre;
	}

	// getters
	public String getGenre() {
		return genre;
	}

	// setters
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return genre;
	}

}
