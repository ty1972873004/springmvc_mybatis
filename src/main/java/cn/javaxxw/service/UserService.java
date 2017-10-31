package cn.javaxxw.service;

import java.util.List;

import cn.javaxxw.common.service.BaseService;
import cn.javaxxw.model.User;

public interface UserService extends BaseService<User> {
	
	public User addUser(String userName,String nickName,String sex,Integer old);
	
	public List<User> getAllUser();

}
