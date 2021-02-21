package com.homes.demo.Database;

import com.homes.demo.school.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Database<T> {
    private SessionFactory factory;
    private Session session;
    public Database(SessionFactory factory){
        this.factory=factory;
        this.session = factory.getCurrentSession();
    }

    public SessionFactory getFactory() {
        return factory;
    }
    //Executes a query such that we can use all over application
    public List<T> executeQuery(String stm){
        return session.createQuery(stm).getResultList();
    }
    public Object getSingleItem(Class aClass, int id){
        //session.beginTransaction();
        return session.get(aClass,id);
    }
    public void deleteObject(Class aClass, int id){
        session.beginTransaction();
        session.delete(session.get(aClass,id));
        session.getTransaction().commit();
    }
    public Object addObject(Object obj){
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        return obj;
    }


}
