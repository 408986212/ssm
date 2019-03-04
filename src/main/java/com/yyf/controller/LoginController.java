package com.yyf.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yyf.dao.LoginDao;
import com.yyf.dao.impl.LoginDaoImpl;
import com.yyf.entity.Login;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController<Login>{
	private HttpServletRequest request;
	private HttpServletResponse response;
	/*@RequestMapping("/addUser3")
    public String addUser3(Login login) {
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		if(username==login.getUsername()&&password==login.getPassword()) {
	        return "/success";

		}	
        return "/error";
 
    }*/
	
	@RequestMapping("/login")
	public void login(String username,String password) {
		JSONObject jo = new JSONObject();
		PrintWriter out = null;
		try {
			out = response.getWriter();
			LoginDao loginDao = new LoginDaoImpl();
			Login user = loginDao.login(username, password);
			if(user!=null) {
				request.getSession().setAttribute("user", user);
				jo.put("state", 0);
				jo.put("msg", "用户登录成功");
			}else {
				jo.put("state", -1);
				jo.put("msg", "用户名或者密码错误");
			}
		}catch(Exception e) {
			jo.put("state", -1);
			jo.put("msg", "登录失败："+e.getMessage());
		}finally {
			String str = JSON.toJSONString(jo);
			System.out.println(str);
			out.write(str);
			out.flush();
			out.close();
		}
}
	}