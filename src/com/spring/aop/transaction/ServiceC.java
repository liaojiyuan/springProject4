package com.spring.aop.transaction;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceUtils;

public class ServiceC {
	public void withdraw() throws Throwable{
		System.out.println("withdraw in ServiceC");
		Connection conn=DataSourceUtils.getConnection(dataSource);
		Statement stmt=conn.createStatement();
		//emails表是仅有一列的一个简单表
		stmt.execute("insert into emails values('admin@test.com')");
		//throw new RuntimeException("some exception");//抛出运行时异常
	}
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	}
}
