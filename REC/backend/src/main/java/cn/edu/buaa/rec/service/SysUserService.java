package cn.edu.buaa.rec.service;

import cn.edu.buaa.rec.model.SysUser;

import java.util.Map;

/**
 * @Description:
 * @Author: suruo
 * @Email: csuruo@gmail.com
 * @Date: Created on 上午6:19 2018/02/01
 * @Modified by:
 */

public interface SysUserService {

    SysUser getByName(String name);

    boolean noExist(String name);

    Map<String,Object> newSysUser(SysUser sysUser);

    Map<String,Object> modSysUserInfo(SysUser sysUserInfo);
}