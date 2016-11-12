package cn.sxt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//使用注解开发
@Controller 
@RequestMapping("/hello2")
public class Hello2Controller 
{
	@RequestMapping(params="method=add")
	public String add()
	{
		System.out.println("add");
		return "redirect:/index.jsp";
	}
	public String update()
	{
		System.out.println("update");
		return "redirect:/index.jsp";
	}
	
	public String delete()
	{
		System.out.println("delete");
		return "redirect:/index.jsp";
	}
	
}
