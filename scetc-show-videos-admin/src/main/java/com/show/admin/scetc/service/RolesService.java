package com.show.admin.scetc.service;

import java.util.List;

import com.show.admin.scetc.pojo.AdminToRole;
import com.show.admin.scetc.pojo.Bgm;
import com.show.admin.scetc.pojo.PageResult;
import com.show.admin.scetc.pojo.Power;
import com.show.admin.scetc.pojo.Roles;
/**
 * 权限相关的服务
* <p>Title: RolesService.java<／p>
* <p>Description: <／p>
 * @author Ray
 **@date 2019年1月13日
 * @version 1.0
 */
import com.show.admin.scetc.pojo.RolesToPower;
public interface RolesService {

	/**
	 * 查询所有权限信息
	 * @return
	 */
	public List<Roles> queryAllRoles();//查询所有角色
	public List<Power> queryAllPowers();//查询所角色拥有的能力/
	public List<RolesToPower> queryAllRolesToPower();//查询所有的角色能力关系表
	public List<AdminToRole> queryAllAdminToRole();//查询所有的管理员与角色的关系表
	
}
