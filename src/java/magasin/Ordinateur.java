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
public class Ordinateur {
     private String marque,disque,cpu,carteg,couleur;
    private int ram;
    private double prix;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDisque() {
        return disque;
    }

    public void setDisque(String disque) {
        this.disque = disque;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCarteg() {
        return carteg;
    }

    public void setCarteg(String carteg) {
        this.carteg = carteg;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Ordinateur() {
    }

    public Ordinateur(String marque, String disque, String cpu, String carteg, String couleur, int ram, double prix) {
        this.marque = marque;
        this.disque = disque;
        this.cpu = cpu;
        this.carteg = carteg;
        this.couleur = couleur;
        this.ram = ram;
        this.prix = prix;
    }

    
    
}
