package com.projects.digitalLibrary.service.impl;



import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Review;
import com.projects.digitalLibrary.repository.BookRepository;
import com.projects.digitalLibrary.repository.ReviewRepository;
import com.projects.digitalLibrary.service.BookService;
import com.projects.digitalLibrary.service.resource.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	@Autowired
	ReviewRepository reviewRepository;;

	public void addBook(Book book){
		bookRepository.save(book);
	}

	//Merging entities manually
//	public List<BookResponse> getAllBooks(){
//
//		List<Book> books = bookRepository.findAll();
//		List<BookResponse> bookResponses = new ArrayList<BookResponse>();
//		for(Book book: books){
//			List<Review> reviews = reviewRepository.findByBookId(book.getId());
//			bookResponses.add(BookResponse.builder().cost(book.getCost()).title(book.getTitle()).author(book.getAuthor()).genre(String.valueOf(book.getGenre())).year(book.getYear()).rating(book.getRating()).author_email(book.getAuthor_email()).reviewList(reviews).build());
//		}
//		//for each book, populate reviews
//		return  bookResponses;
//	}

	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}

	public Book getBook(Integer Id){
		return bookRepository.findById(Id).orElse(null);
	}

	public void deleteBook(Integer Id){
		bookRepository.deleteById(Id);
	}

	public Book updateBook(Integer Id, Book book){
		Optional<Book> original = bookRepository.findById(Id);
		if(original.isPresent()){
			bookRepository.save(book);
		}
		return book;
	}

	@Override
	public void addReview(String bookId, Review review) {

	}
}
