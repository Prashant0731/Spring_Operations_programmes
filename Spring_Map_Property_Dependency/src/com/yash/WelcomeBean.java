package com.yash;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class WelcomeBean {

	private Map employeeData;	  

	public void setemployeeData(Map employeeData) {
		this.employeeData = employeeData;
	}

	public void show()
	   {
		   Set s=employeeData.entrySet();
		   Iterator it = s.iterator();
		   while(it.hasNext())
		   {
			   Map.Entry me = (Map.Entry)it.next();
			   System.out.println(me.getKey()+ " -- "+me.getValue());
		   }
	   }

	}