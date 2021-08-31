package ibatis.services.user;

import java.util.List;

import ibatis.services.domain.User;

/*
 * 비지니스 로직의 템플리이 들어있는 인터페이스
 * 재사용성을 높이기 위해서는
 * 1) 인터페이스와 연결
 * 2) 실체클래스의 객체 생성을 DI 컨테이너에게 맡긴다
 * 개발자는 주문서 작성만 한다
 * 
 * mybatis-userservice-mapping10.xml
 * 설정문서를 보고 결정..
 * 
 * 5개의 템플ㄹ릿 메소드가 필요
 * 메소드 이름은 xml의 id 값
 * 메소드 인자 값은 xml의 parameterType
 */
public interface UserDAO {
	int addUser(User user) throws Exception;

	int updateUser(User user) throws Exception;

	int removeUser(String userId) throws Exception;

	User getUser(String userId) throws Exception;

	List<User> getUserList(User user) throws Exception;
}
