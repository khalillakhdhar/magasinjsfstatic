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
public class LCarte {
    static List<Carte> listcartes=new ArrayList<Carte>();

    public LCarte() {
    }

    public static List<Carte> getListcartes() {
        return listcartes;
    }
    
    public String createCarte(Carte c)
    {
    listcartes.add(c);
    return "cartes.xhtml?jsf-redirect=true";
    
    }
    
}
