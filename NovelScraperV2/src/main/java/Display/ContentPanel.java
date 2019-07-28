/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author super
 */
public class ContentPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContentPanel
     */
    public ContentPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wuxiaWorldNovelCover = new javax.swing.JLabel();
        wuxiaWorldUrlLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);

        wuxiaWorldNovelCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/missing-image.png"))); // NOI18N
        wuxiaWorldNovelCover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        wuxiaWorldUrlLabel.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldUrlLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        wuxiaWorldUrlLabel.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldUrlLabel.setText("Novel Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wuxiaWorldNovelCover)
                .addGap(18, 18, 18)
                .addComponent(wuxiaWorldUrlLabel)
                .addGap(0, 395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wuxiaWorldNovelCover, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wuxiaWorldUrlLabel))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void setImage(Image image)
    {
        ImageIcon icon = new ImageIcon(image);
        this.wuxiaWorldNovelCover.setIcon(icon);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel wuxiaWorldNovelCover;
    private javax.swing.JLabel wuxiaWorldUrlLabel;
    // End of variables declaration//GEN-END:variables
}
