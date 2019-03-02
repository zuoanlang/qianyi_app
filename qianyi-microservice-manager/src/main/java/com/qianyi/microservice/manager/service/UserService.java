package com.qianyi.microservice.manager.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qianyi.microservice.manager.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/24
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "checkUserFallbackMethod") // 进行容错处理
    public TbUser checkUser(String username, String password) {
        String serviceId = "itcast-microservice-user";
        TbUser user= this.restTemplate.getForObject("http://" + serviceId + "/user/" + username,TbUser.class);
        if(user!=null){
            String pwd = user.getUserPassword();
            if(pwd.equals(password)){
                return user;
            }
        }
        return null;
    }
    public TbUser checkUserFallbackMethod(String username,String password){ // 请求失败执行的方法
        return new TbUser("获取用户信息出错!", null);
    }

    @HystrixCommand(fallbackMethod = "checkUserListFallbackMethod") // 进行容错处理
    public List<TbUser> getOrdinaryUserList(int pageNum,int pageSize) {
        String serviceId = "itcast-microservice-user";
        ResponseEntity<List> responseEntity = this.restTemplate.getForEntity("http://" + serviceId + "/user/getOrdinaryUserList?pageNum="+pageNum+"&pageSize="+pageSize, List.class);
        List<TbUser> userList = responseEntity.getBody();
        if(!CollectionUtils.isEmpty(userList)){
            return userList;
        }
        return null;
    }
    public List<TbUser> checkUserListFallbackMethod(int pageNum,int pageSize){ // 请求失败执行的方法
        return null;
    }
}
