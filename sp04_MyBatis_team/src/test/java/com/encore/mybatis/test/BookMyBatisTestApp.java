package com.encore.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.encore.mybatis.vo.MyBook;

/*
 * FactoryService를 모듈화 시켜놓고 그걸 호출하는 구조
 * 최종 테스트 버전. 이걸로 하삼 팀작업할때
 * */
public class BookMyBatisTestApp {
	public static void main(String[] args) throws Exception{
		// 1. Factory 얻어온다.
		SqlSession session = null;
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		// 2. openSession()으로 SqlSession 받아온다. db 연결 쿼리문 실행할 수 있다.
		session = factory.openSession();
		
		
		// Add
		MyBook vo1 = new MyBook();
		vo1.setIsbn("1");
		vo1.setTitle("BookC");
		vo1.setCatalogue("만화");
		vo1.setNation("한국");
		vo1.setPublish_date("2021-01-18");
		vo1.setPublisher("출판사");
		vo1.setAuthor("작가B");
		vo1.setPrice(10000);
		vo1.setCurrency("원");
		vo1.setDescription("재미없다");
		
		MyBook vo = new MyBook();
		vo.setIsbn("2");
		vo.setTitle("BookC");
		vo.setCatalogue("만화");
		vo.setNation("한국");
		vo.setPublish_date("2021-01-18");
		vo.setPublisher("출판사");
		vo.setAuthor("작가B");
		vo.setPrice(50000);
		vo.setCurrency("원");
		vo.setDescription("재미없다");
		
		session.insert("mybookMapper.addBook", vo);
		session.commit();	//DML일떄는 반드시 commit 해줘야 한다.
		
		session.insert("mybookMapper.addBook", vo1);
		session.commit();	//DML일떄는 반드시 commit 해줘야 한다.
		
		System.out.println(vo.getTitle()+"책 등록 성공!");
		
		System.out.println("==================Get All Books========================");
		// Get List
		List<MyBook> list = session.selectList("mybookMapper.getAllBooks");
		System.out.println(list);
		
		System.out.println("\n==================Get One Book========================");
		// Get One book
		MyBook myBook = session.selectOne("mybookMapper.findBook", "1");		
		System.out.println("One book! "+ myBook);
		
		System.out.println("\n==================Update========================");
		// Update
        session.update("mybookMapper.updateBook", vo);
        session.commit();
        System.out.println(vo.getTitle()+"책 수정 성공!");
		
        System.out.println("\n==================n원 이상 책 검색========================");
        List<MyBook> list1 = session.selectList("mybookMapper.findBooksByPrice", 9000);
		System.out.println(list1);
       
		System.out.println("\n==================Delete========================");
		// Delete
        session.delete("mybookMapper.deleteBook", "2");
        session.delete("mybookMapper.deleteBook", "1");
        session.commit();
        session.close();
        System.out.println("책 삭제 성공!");
        
        
	
	}
}
