package com.yyf.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yyf.dao.HouseDao;
import com.yyf.dao.UserInformationDao;
import com.yyf.dao.impl.HouseDaoImpl;
import com.yyf.dao.impl.UserInformationDaoImpl;
import com.yyf.entity.House;
import com.yyf.entity.UserInformation;
@Controller
@RequestMapping("/userinformation")
public class UserInformationController extends BaseController<UserInformation>{
	/*
	private HttpServletRequest request;
	private HttpServletResponse response;
	@RequestMapping("/saveHouse")
	public void saveHouse(String u_ids,String h_ids) {
		JSONObject jo = new JSONObject();
		PrintWriter out = null;
		try {
			out = response.getWriter();
			UserInformationDao userInformationDao = new UserInformationDaoImpl();
			//先删除用户已有的所有角色
			userInformationDao.deleteUserHouseByUids(u_ids);
			//添加用户角色
			List<UserInformation> list = new ArrayList<>();
			for(String u_id:u_ids.split(",")) {
				for(String h_id:h_ids.split(",")) {
					UserInformation userInformation = new UserInformation();
					userInformation.setU_id(Integer.parseInt(u_id));
					userInformation.setR_id(Integer.parseInt(h_id));
					list.add(userInformation);
				}
			}
			userInformationDao.addMore(list);
			jo.put("state", 0);
			jo.put("msg", "角色分配成功");
		}catch(Exception e) {
			jo.put("state", -1);
			jo.put("msg", "角色分配失败："+e.getMessage());
		}finally {
			String str = JSON.toJSONString(jo);
			System.out.println(str);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	@RequestMapping("/getOwnerHouses")
	public void getOwnerHouses(String u_ids) {
		try {
			PrintWriter out = response.getWriter();
			HouseDao dao = new HouseDaoImpl();
			List<House> list = dao.queryAllHousesByUids(u_ids);
			String str = JSON.toJSONString(list);
			System.out.println(str);
			out.write(str);
			out.flush();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/queryAll")
	public void queryAll() {
		
	}
	@RequestMapping("/login")
	public void login(String username,String password) {
		JSONObject jo = new JSONObject();
		PrintWriter out = null;
		try {
			out = response.getWriter();
			UserDao userDao = new UserDaoImpl();
			User user = userDao.login(username, password);
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
	*/
}