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
abstract class Piece {
    
    protected String nom;
    
    abstract void couleur();
    
    
    
    public String toString(){
        String str = "Je suis la piece " + this.nom;
        return str;
    }
}
