package com.mnc.cinema.models.comment;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="LSI_COMMENT")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CMT_ID")
	private Long id;
	
	@Column(name ="CMT_COMMENTER")
	private Long commenter;
	
	@Column(name = "CMT_FILM")
	private Long film;
	
	@Column(name = "CMT_MOMENT")
	private OffsetDateTime moment;
	
	@Lob
	@Column(name = "CMT_CONTENT")
	private String content;

	
	public Comment() {
		super();
	}

	
	public Comment(Long id, Long commenter, Long film, OffsetDateTime moment, String content) {
		super();
		this.id = id;
		this.commenter = commenter;
		this.film = film;
		this.moment = moment;
		this.content = content;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommenter() {
		return commenter;
	}

	public void setCommenter(Long commenter) {
		this.commenter = commenter;
	}

	public Long getFilm() {
		return film;
	}

	public void setFilm(Long film) {
		this.film = film;
	}

	public OffsetDateTime getMoment() {
		return moment;
	}

	public void setMoment(OffsetDateTime moment) {
		this.moment = moment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public int hashCode() {
		return Objects.hash(commenter, content, film, id, moment);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(commenter, other.commenter) && Objects.equals(content, other.content)
				&& Objects.equals(film, other.film) && Objects.equals(id, other.id)
				&& Objects.equals(moment, other.moment);
	}
	
	
	

}
