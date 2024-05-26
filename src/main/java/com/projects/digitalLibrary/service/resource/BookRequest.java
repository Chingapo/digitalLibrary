package com.projects.digitalLibrary.service.resource;


import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Genre;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {


	@NotBlank(message = "title cannot be blank")
	private String title;
	@NotBlank(message = "author cannot be blank")
	private String author;
	private Genre genre;
	@Min(value = 0, message = "cost cannot be negative")
	private Double cost;
	@Min(value = 0, message = "year cannot be negative")
	private Integer year;

	public Book getBook() {
		return Book.builder().title(this.title)
				.author(this.author).rating(0.0)
				.genre(this.genre).cost(this.cost)
				.year(this.year).build();
	}

}
