package com.yash;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcSelect
{
	 JdbcTemplate jd;
	
	public void setJt(JdbcTemplate jd){
		this.jd = jd;
	}

	public void loadAll(){
	//	jd.execute("create table yash(empId int(3), empName varchar(10))");
	//	jd.execute("insert into yash values(101,'Ankit')");
		System.out.println(" New table is created .");
		
		List<?> l =jd.queryForList("select * from sptest1,yash");
		Iterator<?> it = l.iterator();
	
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o.toString());
			System.out.println();
		}
		
	}
}