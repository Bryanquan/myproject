package cn.sxt.controller;
import cn.sxt.vo.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//ʹ��ע�⿪��
@Controller 

public class HelloController 
{
	@RequestMapping("/hello.do")
	public String hello(String name,ModelMap model)
	{ 
		//�൱��request.setAttribute("name",name)
		//model.addAttribute("name",name);
		System.out.print(name);
		return "index.jsp";
	}
	@RequestMapping("/user.do")
	public String user(User user)
	{
		System.out.print(user);
		return "index.jsp";//ת��
	}
}
