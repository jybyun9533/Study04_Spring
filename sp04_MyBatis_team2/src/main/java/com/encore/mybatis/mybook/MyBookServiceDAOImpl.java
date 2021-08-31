package com.encore.mybatis.mybook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.mybatis.vo.MyBook;

@Service
public class MyBookServiceDAOImpl implements MyBookServiceDAO{

	@Autowired
	private MyBookDAO myBookDAO;
	
	@Override
	public void bookAdd(MyBook book) throws Exception {
		myBookDAO.bookAdd(book);
		
	}

	@Override
	public void bookUpdate(MyBook book) throws Exception {
		myBookDAO.bookUpdate(book);
		
	}

	@Override
	public MyBook getBook(String isbn) throws Exception {
		return myBookDAO.getBook(isbn);
	}

	@Override
	public List<MyBook> getBookList(MyBook book) throws Exception {
		return myBookDAO.getBookList(book);
		
	}

	

}
