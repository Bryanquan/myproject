package cn.sxt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//ʹ��ע�⿪��
@Controller 

public class HelloController 
{
	@RequestMapping("/hello.do")
	public String hello(String name,ModelMap model)
	{ 
		//request.setAttribute("name",name)
		//model.addAttribute("name",name);
		System.out.print(name);
		return "index.jsp";
	}
	@RequestMapping("/delete/{id}")
	
	//@PathVariable��ȡ����·��
	public String hello(@PathVariable int id)
	{ 
		//request.setAttribute("name",name)
		//model.addAttribute("name",name);
		System.out.print(id);
		return "/index.jsp";
	}
}
