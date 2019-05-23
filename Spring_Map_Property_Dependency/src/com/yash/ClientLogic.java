package com.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	public static void main(String[] args)
	{
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Object o = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean)o;
		wb.show();
		
		Object o1 = factory.getBean("id2");
		WelcomeBean wb1 = (WelcomeBean)o1;
		wb1.show();

	}

}