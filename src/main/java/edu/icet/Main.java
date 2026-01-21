package edu.icet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(104);
        student.setName("Hashini");
        student.setAge(22);

        Configuration config = new Configuration();
        config.addAnnotatedClass(edu.icet.Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

//        session.persist(student);

        Transaction transaction = session.beginTransaction();

        //session.persist(student);

       // System.out.println(session.find(Student.class,102));

        //session.remove(session.find(Student.class,101));

        session.merge(student);

        transaction.commit();

        session.close();
        factory.close();













    }
}