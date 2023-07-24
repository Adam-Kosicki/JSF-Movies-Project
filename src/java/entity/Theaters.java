/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ozbirn
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Theaters.findAll", query = "SELECT s FROM Theaters s"),
    @NamedQuery(name = "Theaters.findByTheaterid", query = "SELECT s FROM Theaters s WHERE s.theaterid = :theaterid"),
    @NamedQuery(name = "Theaters.findByTheatername", query = "SELECT s FROM Theaters s WHERE s.theatername = :theatername"),
    @NamedQuery(name = "Theaters.findByZip", query = "SELECT s FROM Theaters s WHERE s.zip = :zip"),
    @NamedQuery(name = "Theaters.findMovies", query = "SELECT c FROM Movies c, Playing e WHERE c.movieid = e.playingPK.movieid and e.playingPK.theaterid = :theaterid")
    })
            
public class Theaters implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    private String theaterid;
    @Size(max = 25)
    private String theatername;
    @Size(max = 5)
    private String zip;
    
    /*@JoinColumn(name = "DEPTID", referencedColumnName = "DEPTID")
    @ManyToOne
    private Department deptid;*/

    public Theaters() {
    }

    public Theaters(String theaterid) {
        this.theaterid = theaterid;
    }

    public String getTheaterid() {
        return theaterid;
    }

    public void setTheaterid(String theaterid) {
        this.theaterid = theaterid;
    }

    public String getTheatername() {
        return theatername;
    }

    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }
    
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
/*
    public Department getDeptid() {
        return deptid;
    }

    public void setDeptid(Department deptid) {
        this.deptid = deptid;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterid != null ? theaterid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theaters)) {
            return false;
        }
        Theaters other = (Theaters) object;
        if ((this.theaterid == null && other.theaterid != null) || (this.theaterid != null && !this.theaterid.equals(other.theaterid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theaters[ theaterid=" + theaterid + " ]";
    }
    
}
