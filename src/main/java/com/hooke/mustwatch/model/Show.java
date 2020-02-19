package com.hooke.mustwatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Show {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private String title;
	@NonNull
	private String genre;

	@Override
	public String toString(){
		return String.format(
			"Show{ Title: %s, Genre: %s }",
			this.title, this.genre
			);
	}
}