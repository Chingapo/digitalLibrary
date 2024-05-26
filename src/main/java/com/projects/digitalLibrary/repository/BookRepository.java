package com.projects.digitalLibrary.repository;

import com.projects.digitalLibrary.domain.Book;
import com.projects.digitalLibrary.domain.Genre;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	//adding custom queries

	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);

	List<Book> findByAuthorAndGenre(String author, Genre genre);

//	List<Book> findByAuthorGroupByRating(String author, Double rating);

//	List<Book> findByGenreSortByRating(String genre, Sort sort);
//	@Query("Select * from books where rating > ?1")
//	List<Book> giveMeTopBooks(Double rating);
	//OR
	//List<Book> findByRatingGreaterThan(double rating);

}
