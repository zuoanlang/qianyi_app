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
 * Created by Administrator on 2017/12/6.
 */
@Service
public class UserService {

    @Autowired
    private TbUserMapper tbuserMapper;


    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    public TbUser getUserByUsername(String username) {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<TbUser> tbUsers = tbuserMapper.selectByExample(userExample);
        return tbUsers.get(0);
    }

    /**
     * 查询所有普通用户
     * @return
     */
    public List<TbUser> getOrdinaryUserList(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andDeleteFlagEqualTo("0").andEffectFlagEqualTo("1");
        List<TbUser> userList = tbuserMapper.selectByExample(userExample);
        PageInfo pageInfo = new PageInfo<>(userList);
        return userList;
    }

}
