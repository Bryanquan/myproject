package cn.sxt.bean;

public class Hello 
{
    private String name;
     //set方法用于注解
	public void setName(String name) {
		this.name = name;
	}
	public void show()
	{
		System.out.println("hello"+","+name);
	}
    
}
