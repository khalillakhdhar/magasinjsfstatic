/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Carte {
    private double prix;
    private String stockage,marque;

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getStockage() {
        return stockage;
    }

    public void setStockage(String stockage) {
        this.stockage = stockage;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Carte() {
    }

    public Carte(double prix, String stockage, String marque) {
        this.prix = prix;
        this.stockage = stockage;
        this.marque = marque;
    }
    
    
    
    
    
    
}
