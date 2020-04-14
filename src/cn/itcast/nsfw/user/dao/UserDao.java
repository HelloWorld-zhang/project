package cn.itcast.nsfw.user.dao;

import java.util.List;

import cn.itcast.core.dao.BaseDao;
import cn.itcast.nsfw.user.entity.User;

public interface UserDao extends BaseDao<User> {
	
	public List<User> findUserByAccountAndId(String id,String account);
}
