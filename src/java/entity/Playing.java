/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 *
 * @author ozbirn
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Playing.findAll", query = "SELECT e FROM Playing e"),
    @NamedQuery(name = "Playing.findByMovieid", query = "SELECT e FROM Playing e WHERE e.playingPK.movieid = :movieid"),
    @NamedQuery(name = "Playing.findByTheaterid", query = "SELECT e FROM Playing e WHERE e.playingPK.theaterid = :theaterid"),
    @NamedQuery(name = "Playing.findByDayofshowing", query = "SELECT e FROM Playing e WHERE e.playingPK.movieid = :dayofshowing"),
    @NamedQuery(name = "Playing.findByTimeofshowing", query = "SELECT e FROM Playing e WHERE e.playingPK.timeofshowing = :timeofshowing"),
    @NamedQuery(name = "Playing.findByMovieIdAndTheaterId", query = "SELECT e FROM Playing e WHERE e.playingPK.movieid = :movieid AND e.playingPK.theaterid = :theaterid"),
})

public class Playing implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlayingPK playingPK;

    public Playing() {
    }

    public Playing(PlayingPK playingPK) {
        this.playingPK = playingPK;
    }

    public Playing(String movieid, String theaterid, String dayofshowing, String timeofshowing) {
        this.playingPK = new PlayingPK(movieid, theaterid, dayofshowing, timeofshowing);
    }

    public PlayingPK getPlayingPK() {
        return playingPK;
    }

    public void setPlayingPK(PlayingPK playingPK) {
        this.playingPK = playingPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (playingPK != null ? playingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Playing)) {
            return false;
        }
        Playing other = (Playing) object;
        if ((this.playingPK == null && other.playingPK != null) || (this.playingPK != null && !this.playingPK.equals(other.playingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Playing[ playingPK=" + playingPK + " ]";
    }
    
}
