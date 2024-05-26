package com.projects.digitalLibrary.service;

import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Review;
import com.projects.digitalLibrary.service.resource.BookResponse;

import java.util.List;

public interface BookService {

	public void addBook(Book book);
	public List<Book> getAllBooks();
	public Book getBook(Integer Id);
	public void deleteBook(Integer Id);
	public Book updateBook(Integer Id, Book book);

	public void addReview(String bookId, Review review);

}
