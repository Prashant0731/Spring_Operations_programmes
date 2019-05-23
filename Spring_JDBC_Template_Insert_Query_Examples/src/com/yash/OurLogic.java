package com.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OurLogic
{
	public static void main(String args[])
	{
		Resource res= new ClassPathResource("spconfig.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		SpringJdbcInsert sji =(SpringJdbcInsert)bf.getBean("id3");
		sji.insertAll();
		
	}
}