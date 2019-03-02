package com.qianyi.microservice.manager.controller;

import com.qianyi.microservice.manager.pojo.TbUser;
import com.qianyi.microservice.manager.service.BaseService;
import com.qianyi.microservice.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/22
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private BaseService baseService;

    @Autowired
    private UserService userService;
    /**
     * 访问登录界面
     * @return
     */
    @RequestMapping("/loginPage")
    public String loginPage(Model model,String index){
        if(index != null && index.equals("1")){
            model.addAttribute("result","您的登陆信息已失效，请重新登陆！");
        } else if(index != null && index.equals("2")){
            model.addAttribute("result","用户名或密码错误，请重新登陆！");
        } else {
            model.addAttribute("result","");
        }

        return "loginPage";
    }

    /**
     * 访问主页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //登录操作
    @PostMapping("/login")
    public void userLogin(HttpServletRequest request,HttpServletResponse response, String username, String password) throws IOException {
        String result = baseService.login(request, username, password);
        if(result.equals("loginPage")){
            response.sendRedirect(request.getContextPath()+"/manager/loginPage?index=2");
        } else {
            response.sendRedirect(request.getContextPath()+"/manager/index");
        }
    }

    //登录操作
    @GetMapping("/getOrdinaryUserList")
    @ResponseBody
    public List<TbUser> getOrdinaryUserList(int page , int rows) {
        List<TbUser> ordinaryUserList = userService.getOrdinaryUserList(page, rows);
        return ordinaryUserList;
    }

}
