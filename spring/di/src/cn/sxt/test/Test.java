package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.Student;

public class Test
{
	public static void main(String[] args)
	{
		//解析bean.xml文件，生成管理相应的bean对象
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student hello=(Student) context.getBean("student");
		hello.show();
		hello.say();
		hello.book();
	}
	
}