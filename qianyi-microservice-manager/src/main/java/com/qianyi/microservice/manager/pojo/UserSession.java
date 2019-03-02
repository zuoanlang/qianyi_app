package com.qianyi.microservice.manager.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/25
 */
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class UserSession implements Serializable {

    private static final long serialVersionUID = 9120765714832970813L;
    //id
    private Integer userId;
    //账号
    private String username;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
