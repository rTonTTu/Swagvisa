/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package swagvisa.GUI;

import swagvisa.Logic.Game;

public class GUI extends javax.swing.JFrame {

    
    public GUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeText = new javax.swing.JLabel();
        Statement = new javax.swing.JLabel();
        PlayerName = new javax.swing.JLabel();
        TeamName = new javax.swing.JLabel();
        Questions = new javax.swing.JLabel();
        PlayerField = new javax.swing.JTextField();
        QuestionField = new javax.swing.JTextField();
        TeamField = new javax.swing.JTextField();
        ReadyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swagvisa");

        WelcomeText.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        WelcomeText.setText("Welcome to Swagvisa! ");

        Statement.setText("Please state your player name, team and number of questions");

        PlayerName.setText("Player name:");

        TeamName.setText("Team name:");

        Questions.setText("Questions:");

        TeamField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamFieldActionPerformed(evt);
            }
        });

        ReadyButton.setText("Ready");
        ReadyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReadyButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WelcomeText)
                            .addComponent(Statement)
                            .addComponent(PlayerName)
                            .addComponent(TeamName)
                            .addComponent(Questions)
                            .addComponent(TeamField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeText)
                .addGap(39, 39, 39)
                .addComponent(Statement)
                .addGap(59, 59, 59)
                .addComponent(PlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(TeamName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Questions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(ReadyButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TeamFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamFieldActionPerformed

    private void ReadyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadyButtonActionPerformed
        System.out.println("Tästä napista siirrytään peliin");        
        Game game = new Game(this.PlayerField.getText(), this.TeamField.getText());
        System.out.println("Player: "+this.PlayerField.getText() + "\nTeam: "+ this.TeamField.getText());
    }//GEN-LAST:event_ReadyButtonActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PlayerField;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JTextField QuestionField;
    private javax.swing.JLabel Questions;
    private javax.swing.JButton ReadyButton;
    private javax.swing.JLabel Statement;
    private javax.swing.JTextField TeamField;
    private javax.swing.JLabel TeamName;
    private javax.swing.JLabel WelcomeText;
    // End of variables declaration//GEN-END:variables
}

*/
