/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Klasy;

import Listeners.UtworzKursListener;
import java.util.Vector;

/**
 *
 * @author mrluk
 */
public class UtworzKursOkno extends javax.swing.JFrame {
    Vector<Kurs> listaKursow;
    /**
     * Creates new form UtworzKursOkno
     */
    public UtworzKursOkno(Vector<Kurs> listaKursow) {
        initComponents();
        this.listaKursow = listaKursow;
        utworzButton.addActionListener(new UtworzKursListener(this,nazwaValueField,liczbaGodzinField,listaKursow));
        anulujButton.addActionListener(new Listeners.ZamknijOknoListener(this));
        this.setVisible(true);
        this.setSize(300,150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nazwaValueField = new javax.swing.JTextField();
        liczbaGodzinField = new javax.swing.JTextField();
        utworzButton = new javax.swing.JButton();
        anulujButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        utworzButton.setText("utworz");

        anulujButton.setText("anuluj");
        anulujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(nazwaValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(liczbaGodzinField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(utworzButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anulujButton)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazwaValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liczbaGodzinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utworzButton)
                    .addComponent(anulujButton))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anulujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anulujButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anulujButton;
    private javax.swing.JTextField liczbaGodzinField;
    private javax.swing.JTextField nazwaValueField;
    private javax.swing.JButton utworzButton;
    // End of variables declaration//GEN-END:variables
}
