package cn.sxt.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor
{
    //����������֮ǰִ��
	//�������true����ִ����һ��������������false��ִ����һ��������
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---����֮ǰ---");
		return true;
	}
	
	 //����������ִ��֮��ִ��
		public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
				Object arg2, ModelAndView arg3) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("---�����---");
		}
	 //��DispacherSeverlet�����---ִ�е�������
		public void afterCompletion(HttpServletRequest arg0,
				HttpServletResponse arg1, Object arg2, Exception arg3)
				throws Exception {
			// TODO Auto-generated method stub
			System.out.println("---��Դ�����ͷ�---");
		}
	
          
}
