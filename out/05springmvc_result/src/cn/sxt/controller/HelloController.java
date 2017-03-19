package cn.sxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//ʹ��ע�⿪��
@Controller 

public class HelloController 
{
	@RequestMapping("/hello.do")
	public void hello(HttpServletRequest req,
			HttpServletResponse resq) throws Exception 
			{
		       //resq.getWriter().println("hello spring mvc servelet api");
		     //ʵ���ض���
		      //resq.sendRedirect("index.jsp");
		      //ʵ��ת��
		      req.setAttribute("msg","servlet api");
		      req.getRequestDispatcher("index.jsp").forward(req, resq);
	         }
	@RequestMapping("/hello1.do")
	public String hello1()
	{
		//ת��1
		//return "index.jsp";
		
		//ת��2
		//return "forward:index.jsp";
		return "redirect:index.jsp";
	}
	@RequestMapping("/hello2.do")
	public String hello2()
	{
		return "hello";
	}
}
