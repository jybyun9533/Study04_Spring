package com.encore.mybatis.mybook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mybatis.vo.MyBook;

@Repository
public class MyBookDAOImpl implements MyBookDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int bookAdd(MyBook book) throws Exception {
		int result=sqlSession.insert("mybookMapper.bookAdd", book);
		return result;
	}

	@Override
	public int bookUpdate(MyBook book) throws Exception {
		int result = sqlSession.update("mybookMapper.bookUpdate", book);
		return result;
	}

	@Override
	public int bookDelete(String isbn) throws Exception {
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
