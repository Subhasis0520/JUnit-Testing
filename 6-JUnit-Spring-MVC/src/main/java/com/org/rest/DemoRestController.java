package com.org.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.binding.Book;
import com.org.service.BookService;

@RestController
public class DemoRestController {

	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/book", consumes = {"application/json"})
	public ResponseEntity<String> saveBook(@RequestBody Book book){
		String msg = null;
		boolean saveBook = bookService.saveBook(book);
		if(saveBook) {
			msg = "Booked saved";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
			msg= "Booked not saved";
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
	}
}
