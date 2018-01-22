/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package echecgame;

import echecgame.Observateur;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author qsole
 */

public class EchecFrame extends javax.swing.JFrame{

    // Les trois images pour decorer les cases du jeu
    private static final ImageIcon iconeB = new ImageIcon("./src/icone/case_blanche.png");
    private static final ImageIcon iconeN = new ImageIcon("./src/icone/case_noire.png");

    private static final int taille = 8;
        
    // Les Cases et boutons
    JLabel nextPlayer = new JLabel(iconeB);
    
    //private MorpionModel model;
    
    
    JLabel[][] jboard;

    
    
    
    
    
    
    /**
     * Creates new form MorpionFrame
     */
    
    
    public EchecFrame() {
        //this.model = mm;
        initComponents();
        jboard = new JLabel[taille][taille];
        
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                if((i+j)%2 == 0){
                    jboard[i][j] = new JLabel(iconeB);
                    panelJeu.add(jboard[i][j]);
                }
                else{
                    jboard[i][j] = new JLabel(iconeN);
                    panelJeu.add(jboard[i][j]);
                }
            }
        }
        
        
        this.pack();
    }

    void initBoardPanel(){
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                if((i+j)%2 == 0){
                    jboard[i][j] = new JLabel(iconeB);
                    panelJeu.add(jboard[i][j]);
                }
                else{
                    jboard[i][j] = new JLabel(iconeN);
                    panelJeu.add(jboard[i][j]);
                }
            }
        }
        nextPlayer.setIcon(iconeN);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJeu = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelJeu.setLayout(new java.awt.GridLayout(8, 8));

        jMenu1.setText("Jeu");

        jMenuItem1.setText("Nouvelle Partie");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouvellePartieEvt(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quitter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterEvt(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelJeu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelJeu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterEvt
        System.exit(1);
    }//GEN-LAST:event_quitterEvt

    private void nouvellePartieEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvellePartieEvt
   
    }//GEN-LAST:event_nouvellePartieEvt

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EchecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EchecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EchecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EchecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // MorpionModel model = new MorpionModel();
                EchecFrame frame = new EchecFrame();
                frame.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel panelJeu;
    // End of variables declaration//GEN-END:variables

    
}
