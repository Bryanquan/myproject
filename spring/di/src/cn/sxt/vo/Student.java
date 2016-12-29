package cn.sxt.vo;

public class Student 
{
    private String name;
     //set方法用于注解
    private Address addr;
    private String[] books;
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show()
	{
		System.out.println("name="+name);
	}
   public void say()
   {
		System.out.println("addr="+addr.getAddr());
   }
   public void book()
   {
	  // System.out.println("books="+books);
	   for(int i=0;i<books.length;i++)
	   {
		   System.out.println(books[i]);
	   }
   }
}
