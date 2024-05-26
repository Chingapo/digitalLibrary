package com.projects.digitalLibrary.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@Entity
@Builder
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;
	private String author;
	@Enumerated(value = EnumType.STRING)
	private Genre genre;
	private Double rating;
	private Double cost;
	private Integer year;
	private String author_email;

	// Book - Review
	//One book can have multiple Reviews
	@OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
	@JsonIgnoreProperties("book")
	private List<Review> reviewList;



}
