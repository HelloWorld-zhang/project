package cn.itcast.nsfw.role.service;

import java.io.Serializable;
import java.util.List;

import cn.itcast.nsfw.role.entity.Role;

public interface RoleService {
	
	public void save(Role role);
	public void update(Role role);
	public void delete(Serializable id);
	public Role findObjectById(Serializable id);
	public List<Role> findObjects();
	

}
