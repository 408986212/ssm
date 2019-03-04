package com.yyf.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yyf.entity.UserHouse;
import com.yyf.service.UserHouseService;
@Controller
@RequestMapping("/userHouse")
public class UserHouseController extends BaseController<UserHouse>{
	@Resource(name="userHouseService")
	private UserHouseService userHouseService;
	private HttpServletRequest request;
	private HttpServletResponse response;
	@RequestMapping("/queryAll")
	
	public void queryAll() {
		JSONObject jo = new JSONObject();
		PrintWriter out = null;
		try {
			out = response.getWriter();
			userHouseService.queryV();
			jo.put("state", 0);
			jo.put("msg", "查询记录");
		}catch(Exception e) {
			jo.put("state", -1);
			jo.put("msg", "查询记录失败："+e.getMessage());
		}finally {
			String str = JSON.toJSONString(jo);
			System.out.println(str);
			out.write(str);
			out.flush();
			out.close();
	}
}
	}