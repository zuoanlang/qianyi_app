package com.itheima.microservice.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.microservice.user.mapper.TbUserMapper;
import com.itheima.microservice.user.pojo.TbUser;
import com.itheima.microservice.user.pojo.TbUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/27
 */
@Service
public class PageHelpeTest {

    @Autowired
    private TbUserMapper userMapper;

    public void pageHelperTest(){
        PageHelper.startPage(1,10);
        TbUserExample userExample = new TbUserExample();
        List<TbUser> courseList = userMapper.selectByExample(userExample);

        PageInfo pageInfo = new PageInfo<>(courseList);

        System.out.println(pageInfo.getEndRow());
    }
}
