package com.qianyi.microservice.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/26
 */
@Controller
@RequestMapping("/pages")
public class PagesLoaderController {

    @RequestMapping("/item-add")
    public String itemAdd(){
        return "/pages/item-add";
    }

    @RequestMapping("/content")
    public String content(){
        return "/pages/content";
    }

    @RequestMapping("/content-category")
    public String contentCategory(){
        return "/pages/content-category";
    }

    @RequestMapping("/content-add")
    public String contentAdd(){
        return "/pages/content-add";
    }

    @RequestMapping("/content-edit")
    public String contentEdit(){
        return "/pages/content-edit";
    }

    @RequestMapping("/file-upload")
    public String fileUpload(){
        return "/pages/file-upload";
    }

    @RequestMapping("/user-list")
    public String userList(){
        return "/pages/user-list";
    }

    @RequestMapping("/user-param-list")
    public String userParamList(){
        return "/pages/user-param-list";
    }

}
