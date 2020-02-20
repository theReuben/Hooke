package com.hooke.mustwatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table
public class Show {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String genre;

	public Show() {}

	public Show(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	@Override
	public String toString(){
		return String.format(
			"Show{ Title: %s, Genre: %s }",
			this.title, this.genre
			);
	}
}