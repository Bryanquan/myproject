package cn.sxt.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxController 
{
	@RequestMapping("/ajax")
   public void ajax(String name,HttpServletResponse resp) throws IOException 
   {
	   if("siggy".equals(name))
	   {
		   resp.getWriter().print("true");
	   }else
	   {
		   resp.getWriter().print("fasle");
	   }
   }
}
