package edu.icet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(101);
        student.setName("amal");
        student.setAge(20);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        session.persist(student);









    }
}