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
@Table(name = "LSI_DIFFUSION")
public class Diffusion {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "DFN_ID")
	private Long id;
	
	@JoinColumn(name = "DFN_PLACE")
	@ManyToOne
	private Place place;
	
	@Column(name = "DFN_DATE")
	private OffsetDateTime date;
	
	@JoinColumn(name = "DFN_MOVIE")
	@ManyToOne
	private Movie movie;
	
	public Diffusion() {
		
	}

	public Diffusion(Long id, Place place, OffsetDateTime date, Movie movie) {
		super();
		this.id = id;
		this.place = place;
		this.date = date;
		this.movie = movie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public OffsetDateTime getDate() {
		return date;
	}

	public void setDate(OffsetDateTime date) {
		this.date = date;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, movie, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diffusion other = (Diffusion) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id) && Objects.equals(movie, other.movie)
				&& Objects.equals(place, other.place);
	}
	
	
}
