package com.yash;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcSelect {

	JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	public void loadAll() {
		
		List<?> l=jt.queryForList("select * from sptest1");
		Iterator<?> it=l.iterator();
		
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o.toString());
		}
		System.out.println("LoadALL ");
	}
}
