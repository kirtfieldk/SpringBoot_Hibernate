package com.homes.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Connection;
import java.sql.DriverManager;

/*
	Spring boot application!
	Uses Hybernate with Postgres

 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(Test.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			Test keith = new Test("Keith","Kirtfield",10);
			session.beginTransaction();
			session.save(keith);
			session.getTransaction().commit();
		}catch(Exception e){
			System.out.println(e);
		}
//		SpringApplication.run(DemoApplication.class, args);
	}


}
