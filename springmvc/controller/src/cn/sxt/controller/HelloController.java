package cn.sxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller
{
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resq) throws Exception 
			{
		       ModelAndView mv=new ModelAndView();
		       //封装显示到视图的数据
		       mv.addObject("msg","controller config ");
		       //视图名
		       mv.setViewName("hello");
		       return mv;
	         }
}
