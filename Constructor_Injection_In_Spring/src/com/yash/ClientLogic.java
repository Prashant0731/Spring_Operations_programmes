package com.yash;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory  factory =new XmlBeanFactory(res);
		
	     DemoBean ob = new DemoBean("Welcome to java4s");
         ob.setMessage("Welcome to spring");
         System.out.println("....success......");
	}
}
