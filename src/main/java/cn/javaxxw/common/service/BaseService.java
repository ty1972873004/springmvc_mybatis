package cn.javaxxw.common.service;

import java.util.List;

import cn.javaxxw.common.model.BaseModel;

public interface BaseService<T extends BaseModel> {
	
	int insertOrUpdate(T t);
	
	T findByPk(int id);
	
    List<T> getAll();
	
	
	

}
