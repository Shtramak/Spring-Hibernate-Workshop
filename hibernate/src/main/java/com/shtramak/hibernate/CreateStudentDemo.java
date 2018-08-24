package com.shtramak.hibernate;

import com.shtramak.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        try (Session session = factory.getCurrentSession()) {
            System.out.println("Start transaction...");
            session.beginTransaction();
            Student student = new Student("John", "Doe", "john.doe@gmail.com");
            session.save(student);
            session.getTransaction().commit();
            System.out.println("Transaction finished");
        }
    }
}
