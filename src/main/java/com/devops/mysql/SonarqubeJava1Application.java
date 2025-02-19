package com.devops.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SonarqubeJava1Application {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(SonarqubeJava1Application.class);

	Environment env;
 
 
 
 
	public Environment getEnv() {
	return env;
}

@Autowired
public void setEnv(Environment env) {
	this.env = env;
}


	public static void main(String[] args) {
		SpringApplication.run(SonarqubeJava1Application.class, args);
	}

	
	public Connection createConnection() {
		
		Connection conn=null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhsot:3306", "root", env.getProperty("mysql.password"));
		}
		catch (Exception e) {
		LOGGER.info(e.getMessage());
		}
	
		return conn;
	}
}
