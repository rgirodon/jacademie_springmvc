package org.jacademie.springmvc.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.jacademie.springmvc.domain.Book;
import org.jacademie.springmvc.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Collection<Book> retrieveAllBooks() {
		
		Collection<Book> books = new ArrayList<Book>();
		
		Book book1 = new Book("Livre 1", "Auteur 1");
		books.add(book1);
		
		Book book2 = new Book("Livre 2", "Auteur 2");		
		books.add(book2);
		
		return books;
	}

}
