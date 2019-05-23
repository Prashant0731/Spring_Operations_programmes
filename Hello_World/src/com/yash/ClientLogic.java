package com.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class ClientLogic {

	public static void main(String[] args) {
		
		Resource res =new ClassPathResource("spconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
	
		Object obj=factory.getBean("id1");
		WelcomeBean wb= (WelcomeBean)obj;
		wb.show();
		
		Object obj1=factory.getBean("id2");
		WelcomeBean wb1= (WelcomeBean)obj1;
		wb1.show();
		
		Object obj2=factory.getBean("id3");
		WelcomeBean wb2= (WelcomeBean)obj2;
		wb2.show();
		
	}
}
