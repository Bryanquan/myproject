package cn.sxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//使用注解开发
@Controller 

public class HelloController 
{
	@RequestMapping("/hello.do")
	public void hello(HttpServletRequest req,
			HttpServletResponse resq) throws Exception 
			{
		       //resq.getWriter().println("hello spring mvc servelet api");
		     //实现重定向
		      //resq.sendRedirect("index.jsp");
		      //实现转发
		      req.setAttribute("msg","servlet api");
		      req.getRequestDispatcher("index.jsp").forward(req, resq);
	         }
	@RequestMapping("/hello1.do")
	public String hello1()
	{
		//转发1
		//return "index.jsp";
		
		//转发2
		//return "forward:index.jsp";
		return "redirect:index.jsp";
	}
	@RequestMapping("/hello2.do")
	public String hello2()
	{
		return "hello";
	}
}
