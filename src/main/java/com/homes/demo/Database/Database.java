package com.homes.demo.Database;

import com.homes.demo.school.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Database<T> {
    private SessionFactory factory;
    private Session session;
    public Database(){
        this.factory = new Configuration().configure()
                .buildSessionFactory();
    }
    public SessionFactory getFactory() {
        return factory;
    }
    //Executes a query such that we can use all over application
    public List<T> executeQuery(String stm){
        session = this.factory.getCurrentSession();
        session.beginTransaction();
        return session.createQuery(stm).getResultList();
    }
    public Object getSingleItem(Class aClass, int id){
        //session.beginTransaction();
        session = this.factory.getCurrentSession();
        return session.get(aClass,id);
    }
    public void deleteObject(Class aClass, int id){
        session = this.factory.getCurrentSession();
        session.beginTransaction();
        session.delete(session.get(aClass,id));
        session.getTransaction().commit();
    }
    public Object addObject(Object obj){
        session = this.factory.getCurrentSession();
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        return obj;
    }
    public void commitTransaction(){
        session = this.factory.getCurrentSession();
        session.getTransaction().commit();
    }

}
