package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.Student;

public class Test
{
	public static void main(String[] args)
	{
		//����bean.xml�ļ������ɹ�����Ӧ��bean����
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student hello=(Student) context.getBean("student");
		hello.show();
		hello.say();
		hello.book();
	}
	
}