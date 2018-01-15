/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echecgame;

import java.util.ArrayList;

/**
 *
 * @author qsole
 */
public class Plateau {
    private ArrayList<Case> listeCase;
    
    public Plateau(){
        listeCase = new ArrayList<Case>();
    }
    
    /**
     * @return the listeCase
     */
    public ArrayList getListeCase() {
        return listeCase;
    }
    
    /**
     * @param listeCase the listeCase to set
     */
    public void setListeCase(ArrayList listeCase) {
        this.listeCase = listeCase;
    }
}
