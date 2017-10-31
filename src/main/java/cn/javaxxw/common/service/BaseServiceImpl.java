package cn.javaxxw.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.javaxxw.common.dao.BaseMapper;
import cn.javaxxw.common.model.BaseModel;
import cn.javaxxw.common.util.StringUtil;

public  class BaseServiceImpl<T extends BaseModel> implements BaseService<T>{
	
	
	@Autowired
	protected BaseMapper<T> baseMapper;

	@Override
	public int insertOrUpdate(T t) {
		int result = 0;
		if(StringUtil.isEmpty(t.getId())){
			result = baseMapper.insert(t);
		}else{
			result = baseMapper.update(t);
		}
		return result;
	}

	@Override
	public T findByPk(int id) {
		return baseMapper.get(id);
	}
	
	
	public List<T> getAll(){
		return baseMapper.selectAll();
	}

}
