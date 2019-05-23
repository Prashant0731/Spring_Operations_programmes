package com.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OurLogic {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spconfig.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        MyInterFace inter =(MyInterFace)factory.getBean("id4");
       
        inter.m1();
        System.out.println();
        
        inter.m2();
        System.out.println();
        
        inter.m3();
	}

}
