package com.projects.digitalLibrary.service.resource;

import com.projects.digitalLibrary.domain.Review;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {
	private String title;
	private String author;
	private String genre;
	private Double rating;
	private Double cost;
	private Integer year;
	private String author_email;
	private List<Review> reviewList;
}
