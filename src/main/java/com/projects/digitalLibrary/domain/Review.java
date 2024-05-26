package com.projects.digitalLibrary.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reviews")
@Builder
public class Review {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String comment;
	private Double rating;

	//Review - Book
	//Multiple reviews for a book
	@ManyToOne
	@JoinColumn(name = "book_id")   // format:  classname_variablename
	private Book book;

}
