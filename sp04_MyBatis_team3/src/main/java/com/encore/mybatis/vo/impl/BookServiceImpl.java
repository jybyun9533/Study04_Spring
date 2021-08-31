package com.encore.mybatis.vo.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.mybatis.vo.BookDAO;
import com.encore.mybatis.vo.BookService;
import com.encore.mybatis.vo.MyBook;


@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDAO bookDAO;

	@Override
	public void addBook(MyBook book) throws Exception {
		bookDAO.addBook(book);		
	}

	@Override
	public void updateBook(MyBook book) throws Exception {
		bookDAO.updateBook(book);
	}

	@Override
	public MyBook getBook(String isbn) throws Exception {
		return bookDAO.getBook(isbn);
	}

	@Override
	public List<MyBook> getBookList(MyBook book) throws Exception {
		return bookDAO.getBookList(book);
	}

}
