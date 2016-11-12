package cn.sxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//ʹ��ע�⿪��
@Controller 

public class HelloController 
{
	@RequestMapping("/hello.do")
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resq) throws Exception 
			{
		       ModelAndView mv=new ModelAndView();
		       //��ס��ʾ����ͼ������
		       mv.addObject("msg","hello annotation springmvc");
		       //��ͼ��
		       mv.setViewName("hello");//web-inf/jsp/hello.jsp
		       return mv;
	         }

}
