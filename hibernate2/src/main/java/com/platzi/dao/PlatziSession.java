package com.platzi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {

    private Session session;
    public PlatziSession() {
        super();
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory;
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    public Session getSession(){
        return session;
    }
}
