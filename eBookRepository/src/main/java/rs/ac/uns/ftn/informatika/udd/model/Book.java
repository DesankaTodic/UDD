package rs.ac.uns.ftn.informatika.udd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(nullable = false)
	@Size(max = 80)
	@NotEmpty
	private String title;

	@Size(max = 120)
	private String author;

	@Size(max = 80)
	private String keywords;

	private int publicationYear;

	@Column(nullable = false)
	@Size(max = 200)
	@NotEmpty
	private String filename;

	@Size(max = 100)
	private String mime;

	private Long languageId;
	private String languageName;

	private Long categoryId;
	private String categoryName;

	@Transient
	private String highlight;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
