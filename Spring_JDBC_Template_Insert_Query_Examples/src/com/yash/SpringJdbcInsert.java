package com.yash;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcInsert{
	
	 JdbcTemplate jd;
	
	public void setJt(JdbcTemplate jd){
		this.jd = jd;
	}

	public void insertAll(){
		int	count = 0;
		
		long start = System.currentTimeMillis(); 
		for( int i=0; i<=10; i++) {
		count++;
		
		int k = jd.update("insert into sptest1 values(1001,'Bhopal')");
		
		System.out.println(" : Row is inserted. "+count);
		long end = System.currentTimeMillis();
		
		System.out.print(end - start +" Ms   " );
		}
		
	}
}