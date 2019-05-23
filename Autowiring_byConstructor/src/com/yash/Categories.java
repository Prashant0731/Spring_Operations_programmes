package com.yash;

public class Categories {

	private String cName;
	private Book bk;
	
	public Categories(Book bk) {
		this.bk = bk;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}

	public void show()
	{
		System.out.println(" Categories name :"+cName);
		System.out.println(" Book name :"+bk.getBookName());
		System.out.println(" Book Price :"+bk.getBookPrice());
	}
}