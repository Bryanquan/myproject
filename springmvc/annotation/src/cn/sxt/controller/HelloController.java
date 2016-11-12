package cn.sxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//使用注解开发
@Controller 

public class HelloController 
{
	@RequestMapping("/hello.do")
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resq) throws Exception 
			{
		       ModelAndView mv=new ModelAndView();
		       //封住显示到视图的数据
		       mv.addObject("msg","hello annotation springmvc");
		       //视图名
		       mv.setViewName("hello");//web-inf/jsp/hello.jsp
		       return mv;
	         }

}
