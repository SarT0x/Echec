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
public class Roi extends Piece {
    public Roi(int c){
        super(c, "Roi", 6);
    }

    @Override
    public boolean deplacementPossible(Case caseDepart, Case caseFinal) {
        
        
        
        
        return false;
        
    }
}
