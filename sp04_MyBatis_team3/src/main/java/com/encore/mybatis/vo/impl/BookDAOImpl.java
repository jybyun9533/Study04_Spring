package com.encore.mybatis.vo.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mybatis.vo.BookDAO;
import com.encore.mybatis.vo.MyBook;

/*
 * Persistence Layer Component :: MyBatisUserDAOImpl10
 * SqlSession을 DI 하는 컴포넌트
 * 1)필드에 SqlSession 선언
 * 2)setter로 주입
 * 
 * MyBatisUserDAOImpl10의 Persistence Layer Component가 잘 만들어졌는지를 확인하는
 * Persistence Layer의 단위테스트는 MyBatisTestApp102 
 */
@Repository
public class BookDAOImpl implements BookDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addBook(MyBook book) throws Exception {
		int result=sqlSession.insert("mybookMapper.bookAdd", book);
		return result;
	}

	@Override
	public int updateBook(MyBook book) throws Exception {
		int result = sqlSession.update("mybookMapper.bookUpdate", book);
		return result;
	}

	@Override
	public int removeBook(String isbn) throws Exception {
		int result = sqlSession.delete("mybookMapper.bookDelete",isbn);
		return result;
	}

	@Override
	public MyBook getBook(String isbn) throws Exception {
		return sqlSession.selectOne("mybookMapper.getBook", isbn);
	}

	@Override
	public List<MyBook> getBookList(MyBook book) throws Exception {
		return sqlSession.selectList("mybookMapper.getBookList", book);
	}
}
