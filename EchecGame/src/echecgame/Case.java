/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echecgame;

/**
 *
 * @author qsole
 */
public class Case {
    private Couleur caseCouleur;
    private int coordoneeChiffre;
    private int coordoneeLettre;
    
    public Case(Couleur c,int cC, int cL){
        caseCouleur = c;
        coordoneeChiffre = cC;
        coordoneeLettre = cL;
    }

    /**
     * @return the caseCouleur
     */
    public Couleur getCaseCouleur() {
        return caseCouleur;
    }

    /**
     * @param caseCouleur the caseCouleur to set
     */
    public void setCaseCouleur(Couleur caseCouleur) {
        this.caseCouleur = caseCouleur;
    }

    /**
     * @return the coordoneeChiffre
     */
    public int getCoordoneeChiffre() {
        return coordoneeChiffre;
    }

    /**
     * @param coordoneeChiffre the coordoneeChiffre to set
     */
    public void setCoordoneeChiffre(int coordoneeChiffre) {
        this.coordoneeChiffre = coordoneeChiffre;
    }

    /**
     * @return the coordoneeLettre
     */
    public int getCoordoneeLettre() {
        return coordoneeLettre;
    }

    /**
     * @param coordoneeLettre the coordoneeLettre to set
     */
    public void setCoordoneeLettre(int coordoneeLettre) {
        this.coordoneeLettre = coordoneeLettre;
    }
    
    
    
    
    
    
}
