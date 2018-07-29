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
		//emails���ǽ���һ�е�һ���򵥱�
		stmt.execute("insert into emails values('admin@test.com')");
		//throw new RuntimeException("some exception");//�׳�����ʱ�쳣
	}
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	}
}
