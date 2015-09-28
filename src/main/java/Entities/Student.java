/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author deepak
 */
@Entity
@Table(name = "Student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentID", query = "SELECT s FROM Student s WHERE s.studentID = :studentID"),
    @NamedQuery(name = "Student.findBySemesterAdded", query = "SELECT s FROM Student s WHERE s.semesterAdded = :semesterAdded"),
    @NamedQuery(name = "Student.findByYearAdded", query = "SELECT s FROM Student s WHERE s.yearAdded = :yearAdded")})
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Student_ID")
    private Integer studentID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SemesterAdded")
    private String semesterAdded;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "YearAdded")
    private String yearAdded;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Collection<CheckedOut> checkedOutCollection;

    public Student() {
    }

    public Student(Integer studentID) {
        this.studentID = studentID;
    }

    public Student(Integer studentID, String firstName, String lastName, String semesterAdded, String yearAdded) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.semesterAdded = semesterAdded;
        this.yearAdded = yearAdded;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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

    public String getSemesterAdded() {
        return semesterAdded;
    }

    public void setSemesterAdded(String semesterAdded) {
        this.semesterAdded = semesterAdded;
    }

    public String getYearAdded() {
        return yearAdded;
    }

    public void setYearAdded(String yearAdded) {
        this.yearAdded = yearAdded;
    }

    @XmlTransient
    public Collection<CheckedOut> getCheckedOutCollection() {
        return checkedOutCollection;
    }

    public void setCheckedOutCollection(Collection<CheckedOut> checkedOutCollection) {
        this.checkedOutCollection = checkedOutCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentID != null ? studentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentID == null && other.studentID != null) || (this.studentID != null && !this.studentID.equals(other.studentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Student[ studentID=" + studentID + " ]";
    }
    
}
