package ibatis.services.user;

import java.util.List;

import ibatis.services.domain.User;

/*
 * Service Layer
 * 
 * Data 가공과 관련있는 레이어
 * 
 * 5개의 비지니스템플릿 기능중에서 
 * 관련x : remove
 * 관련많음 : getUser, getUserList
 * 
 */
public interface UserService {
	void addUser(User user) throws Exception;

	void updateUser(User user) throws Exception;

	User getUser(String userId) throws Exception;

	List<User> getUserList(User user) throws Exception;
}
