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
@Table(name = "Tools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tools.findAll", query = "SELECT t FROM Tools t"),
    @NamedQuery(name = "Tools.findByToolID", query = "SELECT t FROM Tools t WHERE t.toolID = :toolID"),
    @NamedQuery(name = "Tools.findByToolName", query = "SELECT t FROM Tools t WHERE t.toolName = :toolName"),
    @NamedQuery(name = "Tools.findByOrderedFrom", query = "SELECT t FROM Tools t WHERE t.orderedFrom = :orderedFrom"),
    @NamedQuery(name = "Tools.findByStatus", query = "SELECT t FROM Tools t WHERE t.status = :status"),
    @NamedQuery(name = "Tools.findByDrawer", query = "SELECT t FROM Tools t WHERE t.drawer = :drawer"),
    @NamedQuery(name = "Tools.findByPlace", query = "SELECT t FROM Tools t WHERE t.place = :place")})
public class Tools implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ToolID")
    private Integer toolID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ToolName")
    private String toolName;
    @Size(max = 45)
    @Column(name = "OrderedFrom")
    private String orderedFrom;
    @Size(max = 45)
    @Column(name = "Status")
    private String status;
    @Column(name = "Drawer")
    private Integer drawer;
    @Column(name = "Place")
    private Integer place;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tools")
    private Collection<CheckedOut> checkedOutCollection;

    public Tools() {
    }

    public Tools(Integer toolID) {
        this.toolID = toolID;
    }

    public Tools(Integer toolID, String toolName) {
        this.toolID = toolID;
        this.toolName = toolName;
    }

    public Integer getToolID() {
        return toolID;
    }

    public void setToolID(Integer toolID) {
        this.toolID = toolID;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getOrderedFrom() {
        return orderedFrom;
    }

    public void setOrderedFrom(String orderedFrom) {
        this.orderedFrom = orderedFrom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDrawer() {
        return drawer;
    }

    public void setDrawer(Integer drawer) {
        this.drawer = drawer;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
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
        hash += (toolID != null ? toolID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tools)) {
            return false;
        }
        Tools other = (Tools) object;
        if ((this.toolID == null && other.toolID != null) || (this.toolID != null && !this.toolID.equals(other.toolID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Tools[ toolID=" + toolID + " ]";
    }
    
}
