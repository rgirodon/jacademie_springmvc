package org.jacademie.springmvc.service;

import java.util.Collection;

import org.jacademie.springmvc.domain.Book;

public interface BookService {

	public Collection<Book> retrieveAllBooks();
}
