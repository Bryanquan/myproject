package cn.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//ʹ��ע�⿪��
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
