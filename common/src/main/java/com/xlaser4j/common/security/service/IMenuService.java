package com.xlaser4j.common.security.service;

import java.util.List;

import com.xlaser4j.common.security.model.NavMenuVO;
import com.xlaser4j.common.security.model.SecurityMenuVO;
import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser4j.common.security.service
 * @author: Elijah.D
 * @time: 2020/3/2 16:10
 * @description:
 * @modified: Elijah.D
 */
@Service
public interface IMenuService {
    /**
     * 根据登陆用户id获取权限列表
     *
     * @return menus
     */
    List<NavMenuVO> listMenusByHrId();

    /**
     * 获取数据库请求路径,对应的角色信息,用于获取当前请求所需要的角色信息
     *
     * @return menuAndRoles
     */
    List<SecurityMenuVO> listMenuAndRoles();
}
