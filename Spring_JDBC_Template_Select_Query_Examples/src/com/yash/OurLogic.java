package com.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OurLogic
{
	public static void main(String args[])
	{
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		SpringJdbcSelect sjs =(SpringJdbcSelect)factory.getBean("id3");
		sjs.loadAll();
		
	}
}