package com.mnc.cinema.models.movie;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="LSI_PERSON")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PRS_ID")
	private Long id;
	
	@Column(name = "PRS_FIRSTNAME")
	private String firstName;
	
	@Column(name = "PRS_LASTNAME")
	private String lastName;
	
	@Column(name = "PRS_AGE")
	private int age;
	
	public Person() {
		
	}
	
	public Person(Long id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}
	
	
	
}
