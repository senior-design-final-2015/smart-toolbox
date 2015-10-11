/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import com.websystique.springmvc.model.Student;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deepak
 */
@Entity
@Table(name = "Checked-Out")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CheckedOut.findAll", query = "SELECT c FROM CheckedOut c"),
    @NamedQuery(name = "CheckedOut.findByStudentID", query = "SELECT c FROM CheckedOut c WHERE c.checkedOutPK.studentID = :studentID"),
    @NamedQuery(name = "CheckedOut.findByToolID", query = "SELECT c FROM CheckedOut c WHERE c.checkedOutPK.toolID = :toolID"),
    @NamedQuery(name = "CheckedOut.findByDateOut", query = "SELECT c FROM CheckedOut c WHERE c.dateOut = :dateOut")})
public class CheckedOut implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CheckedOutPK checkedOutPK;
    @Column(name = "DateOut")
    @Temporal(TemporalType.DATE)
    private Date dateOut;
    @JoinColumn(name = "Student_ID", referencedColumnName = "Student_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;
    @JoinColumn(name = "ToolID", referencedColumnName = "ToolID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tools tools;

    public CheckedOut() {
    }

    public CheckedOut(CheckedOutPK checkedOutPK) {
        this.checkedOutPK = checkedOutPK;
    }

    public CheckedOut(int studentID, int toolID) {
        this.checkedOutPK = new CheckedOutPK(studentID, toolID);
    }

    public CheckedOutPK getCheckedOutPK() {
        return checkedOutPK;
    }

    public void setCheckedOutPK(CheckedOutPK checkedOutPK) {
        this.checkedOutPK = checkedOutPK;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Tools getTools() {
        return tools;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checkedOutPK != null ? checkedOutPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CheckedOut)) {
            return false;
        }
        CheckedOut other = (CheckedOut) object;
        if ((this.checkedOutPK == null && other.checkedOutPK != null) || (this.checkedOutPK != null && !this.checkedOutPK.equals(other.checkedOutPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.CheckedOut[ checkedOutPK=" + checkedOutPK + " ]";
    }
    
}
