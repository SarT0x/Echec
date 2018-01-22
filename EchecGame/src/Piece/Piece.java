/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;

/**
 *
 * @author qsole
 */
public abstract class Piece {
    private int couleur;
    private String nom;
    private int type;
    private int nbDeplacement;
    
    public Piece(int c,String n, int t){
        this.couleur = c;
        this.nom = n;
        this.type = t;
        this.nbDeplacement = 0;
    }

    /**
     * @return the couleur
     */
    public int getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the nbDeplacement
     */
    public int getNbDeplacement() {
        return nbDeplacement;
    }

    /**
     * @param nbDeplacement the nbDeplacement to set
     */
    public void setNbDeplacement(int nbDeplacement) {
        this.nbDeplacement = nbDeplacement;
    }
    
    public abstract boolean deplacementPossible(Case caseDepart, Case caseFinal);
    
    
    
    
}
