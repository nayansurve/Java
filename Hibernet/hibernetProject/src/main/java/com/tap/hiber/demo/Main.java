package com.tap.hiber.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // 1. Load configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        // 2. Create SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // 3. Open session
        Session session = factory.openSession();

        // 4. Start transaction
        Transaction tx = session.beginTransaction();

        // 5. Create student object
        Student s = new Student("Naina", 22);

        // 6. Save object
        session.save(s);

        // 7. Commit transaction
        tx.commit();

        // 8. Close session
        session.close();
        factory.close();

        System.out.println("Student saved successfully!");
    }
}
