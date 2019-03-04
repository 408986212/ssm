package com.yyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yyf.entity.House;
@Controller
@RequestMapping("/house")
public class HouseController extends BaseController<House>{

}