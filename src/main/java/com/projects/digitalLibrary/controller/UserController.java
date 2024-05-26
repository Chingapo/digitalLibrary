package com.projects.digitalLibrary.controller;

import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Review;
import com.projects.digitalLibrary.service.BookService;
import com.projects.digitalLibrary.service.resource.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	BookService bookService;



	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBooks(){

		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer bookId){

		return new ResponseEntity<>(bookService.getBook(bookId), HttpStatus.OK);
	}

	@PostMapping("{bookId}/review")
	public ResponseEntity<Book> addReview(@PathVariable("bookId") String bookId, @RequestBody Review review){
		bookService.addReview(bookId, review);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
