package com.encore.mybatis.mybook;

import java.util.List;

import com.encore.mybatis.vo.MyBook;

/*
 * Service Layer
 * ::
 * Data 가공과 관련있는 레이어
 * ::
 * 5개의 비즈니스 템플릿 기능 중에서 서비스 레이어와 전혀 관련이 없는 기능이 
 */

public interface MyBookServiceDAO {

	void bookAdd(MyBook book) throws Exception;

	void bookUpdate(MyBook book) throws Exception;

	MyBook getBook(String isbn) throws Exception;

	List<MyBook> getBookList(MyBook book) throws Exception;

}
