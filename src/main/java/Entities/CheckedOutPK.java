/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author deepak
 */
@Embeddable
public class CheckedOutPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "Student_ID")
    private int studentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ToolID")
    private int toolID;

    public CheckedOutPK() {
    }

    public CheckedOutPK(int studentID, int toolID) {
        this.studentID = studentID;
        this.toolID = toolID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getToolID() {
        return toolID;
    }

    public void setToolID(int toolID) {
        this.toolID = toolID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) studentID;
        hash += (int) toolID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CheckedOutPK)) {
            return false;
        }
        CheckedOutPK other = (CheckedOutPK) object;
        if (this.studentID != other.studentID) {
            return false;
        }
        if (this.toolID != other.toolID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.CheckedOutPK[ studentID=" + studentID + ", toolID=" + toolID + " ]";
    }
    
}
