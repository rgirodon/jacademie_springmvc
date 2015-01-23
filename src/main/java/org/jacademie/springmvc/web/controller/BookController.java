package org.jacademie.springmvc.web.controller;

import org.apache.log4j.Logger;
import org.jacademie.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

	private static Logger LOGGER = Logger.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
    public String displayBooks(Model model) {

        LOGGER.info("Show books page");

        model.addAttribute("books", this.bookService.retrieveAllBooks());
        
        return "books";
    }
}
