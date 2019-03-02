package com.itheima.microservice.user.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.microservice.user.pojo.TbUser;
import com.itheima.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/12/6.
 */
@RestController
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 对外提供接口服务，根据账号查询用户信息
     *
     * @param username
     * @return
     */
    @GetMapping(value = "user/{username}")
    public TbUser getUserByUsername(@PathVariable("username") String username) {
        return this.userService.getUserByUsername(username);
    }

    /**
     *
     * @return
     */
    @GetMapping(value = "user/getOrdinaryUserList")
    public List<TbUser> getOrdinaryUserList(int pageNum , int pageSize) {
        List<TbUser> userList = this.userService.getOrdinaryUserList(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo<>(userList);
        System.out.println("total:" + pageInfo.getTotal());
        System.out.println("pages:" + pageInfo.getPages());
        System.out.println("pageSize:" + pageInfo.getPageSize());
        return userList;
    }
}
