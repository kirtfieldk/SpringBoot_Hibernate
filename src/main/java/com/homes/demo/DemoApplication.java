package com.homes.demo;

import com.homes.demo.Database.Database;
import com.homes.demo.agent.Agent;
import com.homes.demo.home.Home;
import com.homes.demo.neighborhood.Neighborhood;
import com.homes.demo.school.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/*
	Spring boot application!
	Uses Hybernate with Postgres

 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		Database db = new Database();
		try{
//			SpringApplication.run(DemoApplication.class, args);
			List<School> s =  db.executeQuery("from School");
			for(School a: s){
				System.out.println(a.getCity());
			}
		}catch(Exception e){
			System.out.println(e);
		}
//		SpringApplication.run(DemoApplication.class, args);
	}


}
