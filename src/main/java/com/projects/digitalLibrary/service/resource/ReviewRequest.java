package com.projects.digitalLibrary.service.resource;

import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Review;
import jakarta.validation.constraints.Max;
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
public class ReviewRequest {
	@NotBlank(message = "comment cannot be blank")
	private String comment;
	@Min(value = 0, message = "rating cannot be less than 0")
	@Max(value = 5, message = "rating cannot be more than 5")
	private Double rating;
	@Min(value = 0, message = "bookId cannot be less than 0")
	private Integer bookId;

	public Review toReview(){
		return Review.builder()
				.comment(this.comment)
				.rating(this.rating)
				.book(Book.builder().id(this.bookId).build())
				.build();
	}
}
