/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordeer;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class StartPage extends JPanel {
    private Image img=null;
    private int Width=0;
    private int Height=0;
    public StartPage() {
        initComponents();
        try {
            img=ImageIO.read(new File("img\\back.png"));
        } catch (IOException ex) {}
        btnSingle.setFocusPainted(false);btnSingle.setOpaque(false);btnSingle.setContentAreaFilled(false);btnSingle.setBorderPainted(false);
        btnCompare.setFocusPainted(false);btnCompare.setOpaque(false);btnCompare.setContentAreaFilled(false);btnCompare.setBorderPainted(false);
        btnExit.setFocusPainted(false);btnExit.setOpaque(false);btnExit.setContentAreaFilled(false);btnExit.setBorderPainted(false);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        System.out.println();
        this.Width=this.getSize().width;
        this.Height=this.getSize().height; 
        super.paintComponent(g);
        g.drawImage(img, 0, 0,Width,Height, null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSingle = new javax.swing.JButton();
        btnCompare = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnSingle.setBackground(new java.awt.Color(0,0,0,255));
        btnSingle.setFont(new java.awt.Font("Tahoma", 3, 68)); // NOI18N
        btnSingle.setForeground(new java.awt.Color(255, 0, 51));
        btnSingle.setText("SINGLE");
        btnSingle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingleActionPerformed(evt);
            }
        });

        btnCompare.setBackground(new java.awt.Color(0,0,0,255));
        btnCompare.setFont(new java.awt.Font("Tahoma", 3, 68)); // NOI18N
        btnCompare.setForeground(new java.awt.Color(255, 0, 51));
        btnCompare.setText("Compare");
        btnCompare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompareActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0,0,0,255));
        btnExit.setFont(new java.awt.Font("Tahoma", 3, 68)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 51));
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 160)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Order Computing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompare)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(783, 783, 783))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    private void btnSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingleActionPerformed
        JFrame myapp=new JFrame();
        myapp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        myapp.setUndecorated(true);
        SinglePan app=new SinglePan(myapp);
        myapp.add(app);
        myapp.setVisible(true);
    }//GEN-LAST:event_btnSingleActionPerformed

    private void btnCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompareActionPerformed
        JFrame myapp=new JFrame();
        myapp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        myapp.setUndecorated(true);
        ComparePan app=new ComparePan(myapp);
        myapp.add(app);
        myapp.setVisible(true);
    }//GEN-LAST:event_btnCompareActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompare;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSingle;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
