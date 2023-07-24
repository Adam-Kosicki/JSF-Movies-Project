/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author adas
 */
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


@Named(value = "purchasePageBean")
@RequestScoped
public class PurchasePageBean {
    private Integer tickets;
    private Double total;
    
    private String creditcardnumber;
    private String zipcode;
    
    public PurchasePageBean() {
    }
    
    public String getCreditcardnumber() {
        return creditcardnumber;
    }
    
    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }
    
    public String getZipcode() {
        return zipcode;
    }
    
    public void setZipcode(String creditcardnumber) {
        this.zipcode = zipcode;
    }
    
    public double getTotal() {
        return total * this.tickets;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public Integer getTickets() {
        return tickets;
    }
    
    public void setTickets(Integer tickets) {
        this.tickets = tickets;
    }
}

