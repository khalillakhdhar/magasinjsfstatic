/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Lordinateur {
    static List<Ordinateur> listordinateur=new ArrayList<Ordinateur>();

    public  List<Ordinateur> getListordinateur() {
        return listordinateur;
    }

    public Lordinateur() {
    }
    
    
    
    public String createOrdinateur(Ordinateur or)
    {
        listordinateur.add(or);
        return "ordinateurs.xhtml?jsf-redirect=true";
    
    
    
    }
    
    
    
    
    
}
