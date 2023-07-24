/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ozbirn
 */
@Embeddable
public class PlayingPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    private String theaterid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    private String movieid;
    @NotNull
    @Size(min = 1, max = 15)
    private String dayofshowing;
    @NotNull
    @Size(min = 1, max = 15)
    private String timeofshowing;

    public PlayingPK() {
    }

    public PlayingPK(String theaterid, String movieid, String dayofshowing, String timeofshowing) {
        this.theaterid = theaterid;
        this.movieid = movieid;
        this.dayofshowing = dayofshowing;
        this.timeofshowing = timeofshowing;
    }

    public String getTheaterid() {
        return theaterid;
    }

    public void setTheaterid(String theaterid) {
        this.theaterid = theaterid;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }
    
    public String getDayofshowing() {
        return dayofshowing;
    }

    public void setDayofshowing(String dayofshowing) {
        this.dayofshowing = dayofshowing;
    }
    
    public String getTimeofshowing() {
        return timeofshowing;
    }

    public void setTimeofshowing(String timeofshowing) {
        this.timeofshowing = timeofshowing;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterid != null ? theaterid.hashCode() : 0);
        hash += (movieid != null ? movieid.hashCode() : 0);
        hash += (dayofshowing != null ? dayofshowing.hashCode() : 0);
        hash += (timeofshowing != null ? timeofshowing.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlayingPK)) {
            return false;
        }
        PlayingPK other = (PlayingPK) object;
        if ((this.theaterid == null && other.theaterid != null) || (this.theaterid != null && !this.theaterid.equals(other.theaterid))) {
            return false;
        }
        if ((this.movieid == null && other.movieid != null) || (this.movieid != null && !this.movieid.equals(other.movieid))) {
            return false;
        }
        if ((this.dayofshowing == null && other.dayofshowing != null) || (this.dayofshowing != null && !this.dayofshowing.equals(other.dayofshowing))) {
            return false;
        }
        if ((this.timeofshowing == null && other.timeofshowing != null) || (this.timeofshowing != null && !this.timeofshowing.equals(other.timeofshowing))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PlayingPK[ theaterid=" + theaterid + ", movieid=" + movieid + "dayofshowing=" + dayofshowing + ", timeofshowing=" + timeofshowing + " ]";
    }
    
}
