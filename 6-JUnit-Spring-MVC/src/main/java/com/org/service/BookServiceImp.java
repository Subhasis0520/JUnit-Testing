package com.org.service;

import java.util.HashMap;
import java.util.Map;

import com.org.binding.Book;

public class BookServiceImp implements BookService{

	private Map<Integer, Book> map = new HashMap<>();

	@Override
	public boolean saveBook(Book book) {
		map.put(book.getBookId(), book);
		if(map == null)
			return false;
		return true;
	}
	
	
}
