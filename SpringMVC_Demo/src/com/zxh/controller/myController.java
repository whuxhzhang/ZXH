package com.zxh.controller;

import com.zxh.bean.User;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhzhang on 2018/10/16.
 */
public class myController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        List<User>userList=new ArrayList<User>();
        User user1=new User();
        user1.setAddress("hahha");
        user1.setAge(1);
        user1.setId(1);
        user1.setName("zss");

        User user2=new User();
        user2.setAddress("wwww");
        user2.setAge(2);
        user2.setId(2);
        user2.setName("wjjj");

        userList.add(user1);
        userList.add(user2);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userList",userList);

        modelAndView.setViewName("/WEB-INF/jsp/userList.jsp");
        return modelAndView;
    }
}
