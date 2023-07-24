/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Movies;
import entity.Playing;
import entity.Theaters;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class movieEJB {
    @PersistenceContext(unitName = "JSFMoviesPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<Theaters> findAllTheaters()
    {
        return em.createNamedQuery("Theaters.findAll", Theaters.class).getResultList(); 
    }
                  
    public Theaters getTheater(String theaterid)
    {
        return em.createNamedQuery("Theaters.findByTheaterid", Theaters.class)
                .setParameter("theaterid", theaterid)
                .getSingleResult();
    }
    
    public List<Movies> getMoviesForTheater(String theaterid)
    {
        return em.createNamedQuery("Theaters.findMovies", Movies.class)
                .setParameter("theaterid", theaterid)
                .getResultList();
    }
    public List<Playing> getInstancesOfMovieAtTheater(String theaterid, String movieid) {
        return em.createNamedQuery("Playing.findByMovieIdAndTheaterId", Playing.class)
                .setParameter("movieid", movieid)
                .setParameter("theaterid", theaterid)
                .getResultList();
    }
}
