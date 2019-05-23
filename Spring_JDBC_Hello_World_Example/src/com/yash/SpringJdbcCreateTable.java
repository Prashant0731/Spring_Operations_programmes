package com.yash;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcCreateTable
{
	public JdbcTemplate jdbcTemplate;
	
	public void setJt(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createTable(){
		jdbcTemplate.execute("create table sptest1(sno int(3), sname varchar(10))");
		System.out.println(": table created");
		
		jdbcTemplate.execute("insert into sptest1 values(1,'Prashant') ");
		System.out.println(": sptest1  Data is inserted ");
	
	//	jdbcTemplate.execute("drop table sptest");
		System.out.println(": Deleted successfully");
		
	}
}