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
    @NamedQuery(name = "Movies.findAll", query = "SELECT s FROM Movies s"),
    @NamedQuery(name = "Movies.findByMovieid", query = "SELECT s FROM Movies s WHERE s.movieid = :movieid"),
    @NamedQuery(name = "Movies.findByTitle", query = "SELECT s FROM Movies s WHERE s.title = :title"),
    @NamedQuery(name = "Movies.findByDescription", query = "SELECT s FROM Movies s WHERE s.description = :description"),
    @NamedQuery(name = "Movies.findTheaters", query = "SELECT c FROM Theaters c, Playing e WHERE c.theaterid = e.playingPK.theaterid and e.playingPK.movieid = :movieid")
    })
            
public class Movies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    private String movieid;
    @Size(max = 25)
    private String title;
    @Size(max = 1000)
    private String description;
    
    /*@JoinColumn(name = "DEPTID", referencedColumnName = "DEPTID")
    @ManyToOne
    private Department deptid;*/

    public Movies() {
    }

    public Movies(String movieid) {
        this.movieid = movieid;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (movieid != null ? movieid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movies)) {
            return false;
        }
        Movies other = (Movies) object;
        if ((this.movieid == null && other.movieid != null) || (this.movieid != null && !this.movieid.equals(other.movieid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movies[ movieid=" + movieid + " ]";
    }
    
}
