package libraryjpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;
	private String lastName;

	@ManyToMany(mappedBy = "bookAuthors")
	private Set<Book> booksByAuthor; // used for individual pages ex: author.html, genre.html

	// constructors
	protected Author() {
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Set<Book> getBooksByAuthor() {
		return booksByAuthor;
	}

	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
