/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.movieEJB;
import entity.Movies;
import entity.Theaters;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;


@Named(value = "showTheaterBean")
@RequestScoped
public class ShowTheaterBean {
    @EJB
    private movieEJB movieEJB;
    private Theaters theater;
    
    public ShowTheaterBean() {
    }
    
    public Theaters getTheaters() {
        return theater;
    }

    public void setTheaters(Theaters theater) {
        this.theater = theater;
    }

    public String showTheaters(Theaters theater) {
        this.theater = theater;
        return "ShowTheaters.xhtml";
    }
    
    public String backToTheaters() {
      FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
        fc.getExternalContext().getRequestParameterMap();
      String theaterid =  params.get("theaterid"); 
      theater = movieEJB.getTheater(theaterid);
      return "ShowTheaters.xhtml";
    }
    
    public String showMovies() {
      FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
        fc.getExternalContext().getRequestParameterMap();
      String theaterid =  params.get("theaterid"); 
      theater = movieEJB.getTheater(theaterid);
      return "Movies.xhtml";
    }
    
    public List<Movies> getMovieList()
    {
        if (theater != null)
           return movieEJB.getMoviesForTheater(theater.getTheaterid());
        else
           return null;
    }
    
}
