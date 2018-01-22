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
public class Case {
    private int[][] position;
    private String couleur;
    
    public Case(int x, int y, String c){
        position = new int[x][y];
        couleur = c;
    }

    /**
     * @return the position
     */
    public int[][] getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int[][] position) {
        this.position = position;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    
    
    
}
