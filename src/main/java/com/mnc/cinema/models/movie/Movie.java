package com.mnc.cinema.models.movie;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LSI_MOVIE")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "MOE_ID")
	private Long id;
	
	@Column(name = "MOE_TITLE")
	private String title;
	
	@Column(name = "MOE_RELEASE_DATE")
	private OffsetDateTime releaseDate;
	
	@JoinColumn(name = "MOE_AUTHOR")
	@ManyToOne
	private Person author;
	
	@Column(name= "MOE_DESCRIPTION")
	private String description;
	
	@Column(name = "MOE_GENRE")
	private MovieType movieType;
	
	public Movie() {
		
	}

	public Movie(Long id, String title, OffsetDateTime releaseDate, Person author, String description,
			MovieType movieType) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.author = author;
		this.description = description;
		this.movieType = movieType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public OffsetDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(OffsetDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MovieType getMovieType() {
		return movieType;
	}

	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, description, id, movieType, releaseDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(author, other.author) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && movieType == other.movieType
				&& Objects.equals(releaseDate, other.releaseDate) && Objects.equals(title, other.title);
	}
	
	

}
