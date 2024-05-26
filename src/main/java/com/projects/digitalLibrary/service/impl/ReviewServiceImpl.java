package com.projects.digitalLibrary.service.impl;

import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Review;
import com.projects.digitalLibrary.repository.BookRepository;
import com.projects.digitalLibrary.repository.ReviewRepository;
import com.projects.digitalLibrary.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository reviewRepository;
	@Autowired
	BookRepository  bookRepository;

	@Override
	public void addReview(Review review) {
		Optional<Book> bookOptional = bookRepository.findById(review.getBook().getId());
		if(bookOptional.isEmpty()){
			throw new IllegalArgumentException("book id does not exist");
		}
		review.setBook(bookOptional.get());
		reviewRepository.save(review);
	}
}
