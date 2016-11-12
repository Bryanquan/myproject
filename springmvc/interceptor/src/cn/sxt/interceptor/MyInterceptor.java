package cn.sxt.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor
{
    //在请求处理方法之前执行
	//如果返回true，则执行下一个拦截器，返回false不执行下一个拦截器
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---处理之前---");
		return true;
	}
	
	 //在请求处理方法执行之后执行
		public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
				Object arg2, ModelAndView arg3) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("---处理后---");
		}
	 //在DispacherSeverlet处理后---执行的清理工作
		public void afterCompletion(HttpServletRequest arg0,
				HttpServletResponse arg1, Object arg2, Exception arg3)
				throws Exception {
			// TODO Auto-generated method stub
			System.out.println("---资源清理，释放---");
		}
	
          
}
