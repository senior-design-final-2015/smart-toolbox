package com.websystique.springmvc.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentContext {

    private  SessionFactory factory;

    public static void main(String[] args) {
        Student s = new Student();
        s.setCountry("Nepal");
        s.setEmail("deepak.pokhrel@hotmail.com");
        s.setFirstAttempt(true);
        s.setFirstName("Deepak");
        s.setLastName("Pokhrel");
        s.setSection("Accounting");
        s.setSex("Male");

       
        
        System.out.println(s);

       StudentContext context = new StudentContext();
        context.addStudent(s);

    }
    /* Method to CREATE an employee in the database */

    public Integer addStudent(Student s) {

        Integer studentID = null;

        try {

            factory = new Configuration().configure().buildSessionFactory();

            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            studentID = (Integer) session.save(s);
            tx.commit();
            session.close();
            factory.close();

        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        return studentID;
    }
    /* Method to  READ all the employees */

    public void listEmployees() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List<Employee> employees = session.createQuery("FROM Employee").list();
            for (Employee employee : employees) {
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("Last Name: " + employee.getLastName());
                System.out.println("Salary: " + employee.getSalary());
            }
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    /* Method to UPDATE salary for an employee */

    public void updateEmployee(Integer EmployeeID, int salary) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Employee employee
                    = (Employee) session.get(Employee.class, EmployeeID);
            employee.setSalary(salary);
            session.update(employee);
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    /* Method to DELETE an employee from the records */

    public void deleteEmployee(Integer EmployeeID) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Employee employee
                    = (Employee) session.get(Employee.class, EmployeeID);
            session.delete(employee);
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
}
