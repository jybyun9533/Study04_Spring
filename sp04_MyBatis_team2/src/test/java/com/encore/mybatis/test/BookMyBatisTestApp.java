package com.encore.mybatis.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.encore.mybatis.mybook.MyBookServiceDAO;
import com.encore.mybatis.vo.MyBook;

/*
 * FactoryService를 모듈화 시켜놓고 그걸 호출하는 구조
 * 최종 테스트 버전. 이걸로 하삼 팀작업할때
 * */
public class BookMyBatisTestApp {
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/config/mybookservice.xml" });
		MyBookServiceDAO bookService = (MyBookServiceDAO) context.getBean("myBookServiceImpl");

		// Add
		MyBook vo = new MyBook();
		vo.setIsbn("8");
		vo.setTitle("BookC");
		vo.setCatalogue("만화");
		vo.setNation("한국");
		vo.setPublish_date("2021-01-18");
		vo.setPublisher("출판사");
		vo.setAuthor("작가B");
		vo.setPrice(50000);
		vo.setCurrency("원");
		vo.setDescription("재미없다");

//		//1. User10.addUser Test  :: users table age/grade/redDate 입력값 확인할것 : OK 
//		System.out.println(":: 1. addBook(INSERT)  ? "
//													+ session.insert("mybookMapper.bookAdd",vo)); //1
//													  session.commit();
//		//2. User10.getUser Test :: 주몽 inert 확인 
//		System.out.println(":: 2. getBook(SELECT)  ? ");
//		System.out.println(":: "+session.selectOne("mybookMapper.getBook",vo.getIsbn()) );
//		
//		
//		//3. User10.uadateUser Test  :: users table age/redDate 입력값 확인할것 : OK
//		//                                                    :: 주몽 ==> 온달 수정
//		vo.setTitle("BOOKE");
//		System.out.println(":: 3. update(UPDATE)  ? "
//													+ session.update("mybookMapper.bookUpdate",vo));//1
//											  		  session.commit();
//		 
//		//4. User10.getUserList Test  :: Dynamic Query 확인 id=user04/name=온달 검색
//		System.out.println(":: 4. getBookList(SELECT)  ? ");
//		TestUtil.printList( (List)session.selectList("mybookMapper.getBookList",vo) );
//		
//		//5. User10.removeUser Test
//		System.out.println(":: 5. mybookMapper.removeUser (DELETE)  ? "
//								+session.delete("mybookMapper.bookDelete",vo.getTitle()) );//1
//								 session.commit();
//		
//		//6. User10.getUserList Test  :: Dynamic Query 확인 id=user04/name=온달 검색
//		System.out.println(":: 6. getBookList(SELECT)  ? ");
//		System.out.println(vo);
//		TestUtil.printList((List) session.selectList("mybookMapper.getBookList",vo) ); //이때 위의 기능 리턴타입이 0인걸 확인하자
//	
//		//7. User10.getUserList Test  :: Dynamic Query 확인 id=null/name=null 인경우
//		vo.setIsbn(null);
//		vo.setTitle(null);
//		System.out.println(":: 7. getBookList(SELECT)  ? ");
//		TestUtil.printList( (List) session.selectList("mybookMapper.getBookList",vo) );
//		
//		########## 30000원 보다 작은 가격의 책 검색 ############
//		TestUtil.printList((List) session.selectList("mybookMapper.pirceList", 30000));
//		########## 30000원 보다 큰 가격의 책 검색 ############
//		TestUtil.printList((List) session.selectList("mybookMapper.pirceList2", 30000));
//		########## 출판사 기준으로 책 찾기 #####################
//		TestUtil.printList((List) session.selectList("mybookMapper.getBookPublisher", "출판사"));
//		########## 작가 기준으로 책 찾기 ####################
//		TestUtil.printList((List) session.selectList("mybookMapper.getBookAuthor", "작가B"));

//		session.insert("mybookMapper.bookAdd", vo);
//		session.commit();	//DML일떄는 반드시 commit 해줘야 한다.
//		
//		session.close();
//		
//		System.out.println(vo.getTitle()+"책 등록 성공!");

//		System.out.println("==================Get All Books========================");
//		// Get List
//		List<MyBook> list = session.selectList("mybookMapper.bookList");
//		System.out.println(list);
//		
//		System.out.println("\n==================Get One Book========================");
//		// Get One book
//		MyBook myBook = session.selectOne("mybookMapper.bookOne", "1");		
//		System.out.println("One book! "+ myBook);
//		
//		System.out.println("\n==================Update========================");
//		// Update
//        session.update("mybookMapper.bookUpdate", vo);
//        session.commit();
////        session.close();
//        System.out.println(vo.getTitle()+"책 수정 성공!");
//		
//		
//		System.out.println("\n==================Delete========================");
//		// Delete
//        session.delete("mybookMapper.bookDelete", "1");
//        session.commit();
//        session.close();
//        System.out.println("책 삭제 성공!");

	}
}
