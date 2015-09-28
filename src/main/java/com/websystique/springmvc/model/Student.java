package com.websystique.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 3, max = 30)
    private String firstName;

    @Size(min = 3, max = 30)
    private String lastName;

    @NotEmpty
    private String sex;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    @Column(name = "section_")
    private String section;

    @NotEmpty
    private String country;

    private boolean firstAttempt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isFirstAttempt() {
        return firstAttempt;
    }

    public void setFirstAttempt(boolean firstAttempt) {
        this.firstAttempt = firstAttempt;
    }

    public void addStudent() {
        try {

            SessionFactory factory;

            factory = new Configuration().configure().buildSessionFactory();

            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            session.save(this);
            tx.commit();
            session.close();
            factory.close();

        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + ", email=" + email + ", section=" + section + ", country=" + country + ", firstAttempt=" + firstAttempt + '}';
    }
    
    public void add(){
        Student s = new Student();
        s.setCountry("Nepal");
        s.setEmail("deepak.pokhrel@hotmail.com");
        s.setFirstAttempt(true);
        s.setFirstName("Deepak");
        s.setLastName("Pokhrel");
        s.setSection("Accounting");
        s.setSex("Male");

       
        
        System.out.println(s);

      s.addStudent();

    }
    
     public static void main(String[] args) {
         Student s= new Student();
         s.add();
        
    }
    

}
