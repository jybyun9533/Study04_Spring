package com.encore.mybatis.vo;

import java.util.List;


/*
 * Service Layer
 * ::
 * Data 가공과 관련있는 레이어
 * ::
 * 5개의 비즈니스 템플릿 기능 중에서 서비스 레이어와 전혀 관련이 없는 기능이 
 */

public interface BookService {

	void addBook(MyBook book) throws Exception;
	void updateBook(MyBook book) throws Exception;
	
	MyBook getBook(String isbn) throws Exception;
	List<MyBook> getBookList(MyBook book) throws Exception;

}
