package com.encore.mybatis.mybook;

import java.util.List;

import com.encore.mybatis.vo.MyBook;

public interface MyBookDAO {
	int bookAdd(MyBook book) throws Exception;

	int bookUpdate(MyBook book) throws Exception;

	int bookDelete(String isbn) throws Exception;

	MyBook getBook(String isbn) throws Exception;

	List<MyBook> getBookList(MyBook book) throws Exception;

}
