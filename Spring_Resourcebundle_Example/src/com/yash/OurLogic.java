package com.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OurLogic {

	public static void main(String[] args) {

	Resource res =new ClassPathResource("spconfig.xml");
	XmlBeanFactory factory = new XmlBeanFactory(res);
	
	PropertyPlaceholderConfigurer ppc=new PropertyPlaceholderConfigurer();
	ppc.setLocation(new ClassPathResource("/jdbcBundle.properties"));
	ppc.postProcessBeanFactory(factory);
	
	
	SpringJdbcSelect sjs = (SpringJdbcSelect)factory.getBean("id3");
	sjs.loadAll();
	System.out.println("Our Logic success Full");
	
	}

}
