package com.mnc.cinema.models.movie;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LSI_PLACE")
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PLE_ID")
	private Long id;
	
	@Column(name = "PLE_ADDRESS")
	private String address;
	
	@Column(name = "PLE_NAME")
	private String name;
	
	public Place() {
		
	}

	public Place(Long id, String address, String name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Place other = (Place) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
}
