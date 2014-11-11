package com.nothing.spring.web;

import com.nothing.spring.domain.User;
import com.nothing.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author chenliu, create at 9/17/14 20:19
 */

@Controller
public class LoginController {


    @Autowired
    private UserService userService;


    //负责处理index.html请求
    @RequestMapping({"/index.html", "login.html"})
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginInfo) {




        boolean isValidUser = userService.matchUser(loginInfo.getUserName(), loginInfo.getPassword());
        if (!isValidUser) {
            return new ModelAndView("login", "error", "用户名或密码错误");
        }
        User user = userService.findUserByName(loginInfo.getUserName());
        user.setLastIp(request.getRemoteAddr());
        user.setLastVisit(new Date());

        userService.loginSuccess(user);
        request.getSession().setAttribute("user", user);
        return new ModelAndView("main");
    }

}
