package com.projects.digitalLibrary.controller;

import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.service.BookService;
import com.projects.digitalLibrary.service.resource.BookRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

	@Autowired
	BookService bookService;

	@PostMapping("/admin/book")
	public ResponseEntity<Book> createBook(@RequestBody @Valid BookRequest bookRequest){

		bookService.addBook(bookRequest.getBook());
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/admin/book")
	public ResponseEntity<Book> updateBook(@RequestParam("bookId") Integer id, @RequestBody BookRequest bookRequest){
		return new ResponseEntity<>(bookService.updateBook(id, bookRequest.getBook()), HttpStatus.OK);
	}

	@DeleteMapping("/admin/book")
	public ResponseEntity<Book> deleteBook(@RequestParam Integer id){
		bookService.deleteBook(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
