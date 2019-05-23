package com.yash;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		
		Object obj =factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean)obj;
		wb.show();
		System.out.println(" ........................ ");
	}
}
