package com.encore.mybatis.vo;


import java.util.List;


public interface BookDAO {
	
	int addBook(MyBook book) throws Exception;
	int updateBook(MyBook book) throws Exception;
	int removeBook(String isbn) throws Exception;
	MyBook getBook(String isbn) throws Exception;
	List<MyBook> getBookList(MyBook book) throws Exception;

}
