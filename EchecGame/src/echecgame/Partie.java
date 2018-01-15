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
public class Partie {
    private int[][] board;
    private int nextPlayer;
    private int nbCoups;
    private boolean gagnee;
    ArrayList<Observateur> listOb;
    
    public Partie(){
        listOb = new ArrayList<Observateur>();
        nouvellePartie();
    }
    
    public void nouvellePartie(){
        board = new int[8][8];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = 0;
            }
        }
        nbCoups = 0;
        nextPlayer = 1;
        gagnee = false;
    }
}
