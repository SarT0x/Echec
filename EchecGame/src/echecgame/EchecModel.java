/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echecgame;

import Piece.Case;
import java.util.ArrayList;

/**
 *
 * @author qsole
 */
public class EchecModel {
    private Case[][] plateau;
    private int nextPlayer;
    private int nbCoups;
    private boolean gagnee;
    private ArrayList<Observateur> listOb;
    
    
    public EchecModel(){
        listOb = new ArrayList<Observateur>();
        nouvellePartie();
    }
    public void register(Observateur o){
        getListOb().add(o);
    }
    public void unregister(Observateur o){
        getListOb().remove(o);
    }
    public void avertirAllObservateur(int i,int j){
        for(Observateur ob : getListOb()){
            ob.avertir(i, j);
        }
    }
    public void avertirFinPartieAllObservateurs(boolean avecVainqueur){
        for(Observateur ob : getListOb()){
            ob.avertirFinPartie(avecVainqueur);
        }
    }
    public void avertirNewGameAllObservateur(){
        for(Observateur ob : getListOb()){
            ob.avertirNewGame();
        }
    }
    
    public void nouvellePartie(){
        setPlateau(new Case[8][8]);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                
            }
        }
        setNbCoups(0);
        setNextPlayer(1);
        setGagnee(false);
        avertirNewGameAllObservateur();
    }
    
    public int getJoueur(){
           return this.getNextPlayer();
    }
    
    private void changerJoueur(){
        switch (this.getNextPlayer()) {
            case 1:
                this.setNextPlayer(2);
                break;
            case 0:
                this.setNextPlayer(1);
                break;
            default:
                this.setNextPlayer(1);
                break;
        }
    }
    
    void play(int i, int j){
       
    }
    
    public boolean unVainqueur(int i,int j){
        return 
            // ligne pleine
            ((plateau[i][0] == plateau[i][1] && plateau[i][1] == plateau[i][2])
            // colonne pleine
            || ((plateau[0][j] == plateau[1][j] && plateau[1][j] == plateau[2][j]))
            // premiere diagonale pleine
            || (i == j	
                && plateau[0][0] == plateau[1][1]
                && plateau[1][1] == plateau[2][2])
            // deuxieme diagonale pleine    
            || (i + j == 2	
                && plateau[0][2] == plateau[1][1]
                && plateau[1][1] == plateau[2][0]));
    }
    
    public String toString(){
        String ch = "";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ch += plateau[i][j];
            }
        }
        ch += "\n";
        return ch;
    }

    /**
     * @return the plateau
     */
    public Case[][] getPlateau() {
        return plateau;
    }

    /**
     * @param plateau the plateau to set
     */
    public void setPlateau(Case[][] plateau) {
        this.plateau = plateau;
    }

    /**
     * @return the nextPlayer
     */
    public int getNextPlayer() {
        return nextPlayer;
    }

    /**
     * @param nextPlayer the nextPlayer to set
     */
    public void setNextPlayer(int nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    /**
     * @return the nbCoups
     */
    public int getNbCoups() {
        return nbCoups;
    }

    /**
     * @param nbCoups the nbCoups to set
     */
    public void setNbCoups(int nbCoups) {
        this.nbCoups = nbCoups;
    }

    /**
     * @return the gagnee
     */
    public boolean isGagnee() {
        return gagnee;
    }

    /**
     * @param gagnee the gagnee to set
     */
    public void setGagnee(boolean gagnee) {
        this.gagnee = gagnee;
    }

    /**
     * @return the listOb
     */
    public ArrayList<Observateur> getListOb() {
        return listOb;
    }

    /**
     * @param listOb the listOb to set
     */
    public void setListOb(ArrayList<Observateur> listOb) {
        this.listOb = listOb;
    }
}
