package cn.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//使用注解开发
@Controller 

public class HelloController 
{
	@RequestMapping("hello")
	public String hello()
	{
		System.out.print("hello controller");
		return "index.jsp";
	}

}
