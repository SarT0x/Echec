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
public class Cavalier extends Piece {
    public Cavalier(int c){
        super(c, "Cavalier", 2);
    }

    @Override
    public boolean deplacementPossible(Case caseDepart, Case caseFinal) {
        
        
        
        
        return false;
        
    }
}
